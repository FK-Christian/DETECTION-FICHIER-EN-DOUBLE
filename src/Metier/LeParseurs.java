package Metier;

import crud.Les_fichiers;
import crud.Les_repertoires;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.RecursiveTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.json.simple.JSONObject;

/**
 *
 * @author FKC-Standard
 */
public class LeParseurs extends RecursiveTask<List<String>>{
    private Les_fichiers lesfichiers;
    private Les_repertoires lesrepertoires;
    private String racine;
    private static final long serialVersionUID = 1L;
    private ArrayList lesExtensions;
    
    public LeParseurs(String racine_chemin_absolu,ArrayList extensions){
        try {
            this.racine = racine_chemin_absolu;
            this.lesExtensions = extensions;
            lesrepertoires = new Les_repertoires();
            lesrepertoires.setChemin_absolu(racine_chemin_absolu);
            lesrepertoires.setDate_Visite(new Date());
            lesrepertoires.save();
            lesrepertoires.refresh();
        } catch (Exception ex) {
            Logger.getLogger(LeParseurs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String HascheDuFichier(File file,String type){
     String localSha1Sum = "impossible de calculer le hasche";
     if (file.exists() && file.isFile() && file.canRead()){
             try {
                     MessageDigest md = MessageDigest.getInstance(type);
                     DigestInputStream dis = new DigestInputStream(new FileInputStream(file), md);
                     dis.on(true);
                     while (dis.read() != -1){
                             ;
                     }
                     byte[] b = md.digest();
                     localSha1Sum = getHexString(b);
             } catch (Exception ex) {
                     ex.printStackTrace();
             }
     } else {
             System.out.println("impossible de trouver le fichier : "+file.getAbsolutePath());
     }
     return localSha1Sum;
    }
    
    private String getHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length*2);
        for (byte b : bytes) {
                if (b <= 0x0F && b >= 0x00) { // On rajoute le 0 de poid fort ignoré à la conversion.
                        sb.append('0');
                }
                sb.append( String.format("%x", b) );
        }
        return sb.toString();
    }
    
    private static Connection getCon(){
       JSONObject data = provider("paramBD.properties");
       try{
           Class.forName(data.get("driver_class").toString());
           return DriverManager.getConnection(data.get("URL").toString(),data.get("UserName").toString(),data.get("Password").toString());
        }catch(Exception e) {
	} 
       return null;
   }
    
    public static JSONObject provider(String FICHIER_PROPERTIES){
        JSONObject param = new JSONObject();
        Properties properties = new Properties();
	InputStream fichierProperties = null;
        try {
            fichierProperties = new FileInputStream(FICHIER_PROPERTIES);
            properties.load(fichierProperties);
            Enumeration<?> e = properties.propertyNames();
            
            while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = properties.getProperty(key);
                        param.put(key, value);
		}
            
            
        } catch (Exception e) {
        } finally {
		if (fichierProperties != null) {
			try {
				fichierProperties.close();
			} catch (IOException e) {
			}
		}
        }
        return param;
    }
    
    public void imprimer(){
        try {
            JasperPrint jasperPrint = null;
            String fichier = "Stat",sortie="Stat.pdf";
            HashMap autre = new HashMap();
            JasperCompileManager.compileReportToFile(fichier+".jrxml");
            jasperPrint = JasperFillManager.fillReport(fichier+".jasper",autre,getCon());
            JasperExportManager.exportReportToPdfFile(jasperPrint,"JASPER_"+sortie);
            Desktop.getDesktop().open(new File("JASPER_"+sortie));
        } catch (JRException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(LeParseurs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   @Override
    protected List<String> compute(){
        List<String> list = new ArrayList<String>();
        List<LeParseurs> tasks = new ArrayList<LeParseurs>();
        File file = new File(racine);
        File content[] = file.listFiles();
        if (content != null){
            for (int i = 0; i < content.length; i++){
                if (content[i].isDirectory()){
                    LeParseurs task = new LeParseurs(content[i].getAbsolutePath(), lesExtensions);
                    task.fork();
                    tasks.add(task);
                }else{
                    try {
                        if (checkFile(content[i].getName())){
                            lesfichiers = new Les_fichiers();
                            lesfichiers.setChemin_Absolu(content[i].getAbsolutePath());
                            lesfichiers.setLes_repertoiresChemin_absolu(lesrepertoires);
                            lesfichiers.setDate_visite(new Date());
                            lesfichiers.setHasche_du_fichier(HascheDuFichier(content[i],"SHA-256"));
                            lesfichiers.setEtat_du_fichier("EXISTE");
                            lesfichiers.save();
                            list.add(content[i].getAbsolutePath());
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(LeParseurs.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
      }
      addResultsFromTasks(list, tasks);
      return list;
    }
   
    private void addResultsFromTasks(List<String> list, List<LeParseurs> tasks){
        for (LeParseurs item : tasks){
            list.addAll(item.join());
        }
    }
 
    private boolean checkFile(String name){
        for(int i = 0; i < lesExtensions.size(); i++) {
            String get = lesExtensions.get(i).toString();
            if(name.endsWith(get)) return true;
        }
        return false;
   }
    
}
