/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package crud;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Les_fichiers {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Les_fichiers.class);
	public Les_fichiers() {
	}
	
	public static Les_fichiers loadLes_fichiersByORMID(String chemin_Absolu) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return loadLes_fichiersByORMID(session, chemin_Absolu);
		}
		catch (Exception e) {
			_logger.error("loadLes_fichiersByORMID(String chemin_Absolu)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers getLes_fichiersByORMID(String chemin_Absolu) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return getLes_fichiersByORMID(session, chemin_Absolu);
		}
		catch (Exception e) {
			_logger.error("getLes_fichiersByORMID(String chemin_Absolu)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers loadLes_fichiersByORMID(String chemin_Absolu, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return loadLes_fichiersByORMID(session, chemin_Absolu, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLes_fichiersByORMID(String chemin_Absolu, org.hibernate.LockMode lockMode)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers getLes_fichiersByORMID(String chemin_Absolu, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return getLes_fichiersByORMID(session, chemin_Absolu, lockMode);
		}
		catch (Exception e) {
			_logger.error("getLes_fichiersByORMID(String chemin_Absolu, org.hibernate.LockMode lockMode)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers loadLes_fichiersByORMID(PersistentSession session, String chemin_Absolu) throws Exception {
		try {
			return (Les_fichiers) session.load(crud.Les_fichiers.class, chemin_Absolu);
		}
		catch (Exception e) {
			_logger.error("loadLes_fichiersByORMID(PersistentSession session, String chemin_Absolu)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers getLes_fichiersByORMID(PersistentSession session, String chemin_Absolu) throws Exception {
		try {
			return (Les_fichiers) session.get(crud.Les_fichiers.class, chemin_Absolu);
		}
		catch (Exception e) {
			_logger.error("getLes_fichiersByORMID(PersistentSession session, String chemin_Absolu)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers loadLes_fichiersByORMID(PersistentSession session, String chemin_Absolu, org.hibernate.LockMode lockMode) throws Exception {
		try {
			return (Les_fichiers) session.load(crud.Les_fichiers.class, chemin_Absolu, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLes_fichiersByORMID(PersistentSession session, String chemin_Absolu, org.hibernate.LockMode lockMode)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers getLes_fichiersByORMID(PersistentSession session, String chemin_Absolu, org.hibernate.LockMode lockMode) throws Exception {
		try {
			return (Les_fichiers) session.get(crud.Les_fichiers.class, chemin_Absolu, lockMode);
		}
		catch (Exception e) {
			_logger.error("getLes_fichiersByORMID(PersistentSession session, String chemin_Absolu, org.hibernate.LockMode lockMode)", e);
			throw new Exception(e);
		}
	}
	
	public static List queryLes_fichiers(String condition, String orderBy) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return queryLes_fichiers(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryLes_fichiers(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static List queryLes_fichiers(String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return queryLes_fichiers(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryLes_fichiers(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers[] listLes_fichiersByQuery(String condition, String orderBy) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return listLes_fichiersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listLes_fichiersByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers[] listLes_fichiersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return listLes_fichiersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listLes_fichiersByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static List queryLes_fichiers(PersistentSession session, String condition, String orderBy) throws Exception {
		StringBuffer sb = new StringBuffer("From crud.Les_fichiers as Les_fichiers");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listLes_fichiersByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static List queryLes_fichiers(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		StringBuffer sb = new StringBuffer("From crud.Les_fichiers as Les_fichiers");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Les_fichiers", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listLes_fichiersByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers[] listLes_fichiersByQuery(PersistentSession session, String condition, String orderBy) throws Exception {
		try {
			List list = queryLes_fichiers(session, condition, orderBy);
			return (Les_fichiers[]) list.toArray(new Les_fichiers[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLes_fichiersByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers[] listLes_fichiersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		try {
			List list = queryLes_fichiers(session, condition, orderBy, lockMode);
			return (Les_fichiers[]) list.toArray(new Les_fichiers[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLes_fichiersByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers loadLes_fichiersByQuery(String condition, String orderBy) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return loadLes_fichiersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadLes_fichiersByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers loadLes_fichiersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return loadLes_fichiersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLes_fichiersByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers loadLes_fichiersByQuery(PersistentSession session, String condition, String orderBy) throws Exception {
		Les_fichiers[] les_fichierses = listLes_fichiersByQuery(session, condition, orderBy);
		if (les_fichierses != null && les_fichierses.length > 0)
			return les_fichierses[0];
		else
			return null;
	}
	
	public static Les_fichiers loadLes_fichiersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		Les_fichiers[] les_fichierses = listLes_fichiersByQuery(session, condition, orderBy, lockMode);
		if (les_fichierses != null && les_fichierses.length > 0)
			return les_fichierses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLes_fichiersByQuery(String condition, String orderBy) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return iterateLes_fichiersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateLes_fichiersByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static java.util.Iterator iterateLes_fichiersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return iterateLes_fichiersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateLes_fichiersByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static java.util.Iterator iterateLes_fichiersByQuery(PersistentSession session, String condition, String orderBy) throws Exception {
		StringBuffer sb = new StringBuffer("From crud.Les_fichiers as Les_fichiers");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateLes_fichiersByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static java.util.Iterator iterateLes_fichiersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		StringBuffer sb = new StringBuffer("From crud.Les_fichiers as Les_fichiers");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Les_fichiers", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateLes_fichiersByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_fichiers createLes_fichiers() {
		return new crud.Les_fichiers();
	}
	
	public boolean save() throws Exception {
		try {
			crud.DoublonsPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			_logger.error("save()", e);
			throw new Exception(e);
		}
	}
	
	public boolean delete() throws Exception {
		try {
			crud.DoublonsPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete()", e);
			throw new Exception(e);
		}
	}
	
	public boolean refresh() throws Exception {
		try {
			crud.DoublonsPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh()", e);
			throw new Exception(e);
		}
	}
	
	public boolean evict() throws Exception {
		try {
			crud.DoublonsPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict()", e);
			throw new Exception(e);
		}
	}
	
	public boolean deleteAndDissociate()throws Exception {
		try {
			if(getLes_repertoiresChemin_absolu() != null) {
				getLes_repertoiresChemin_absolu().les_fichiers.remove(this);
			}
			
			return delete();
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new Exception(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws Exception {
		try {
			if(getLes_repertoiresChemin_absolu() != null) {
				getLes_repertoiresChemin_absolu().les_fichiers.remove(this);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate(org.orm.PersistentSession session)", e);
			throw new Exception(e);
		}
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == crud.ORMConstants.KEY_LES_FICHIERS_LES_REPERTOIRESCHEMIN_ABSOLU) {
			this.les_repertoiresChemin_absolu = (crud.Les_repertoires) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private String chemin_Absolu;
	
	private java.util.Date date_visite;
	
	private String hasche_du_fichier;
	
	private String etat_du_fichier;
	
	private crud.Les_repertoires les_repertoiresChemin_absolu;
	
	public void setChemin_Absolu(String value) {
		this.chemin_Absolu = value;
	}
	
	public String getChemin_Absolu() {
		return chemin_Absolu;
	}
	
	public String getORMID() {
		return getChemin_Absolu();
	}
	
	public void setDate_visite(java.util.Date value) {
		this.date_visite = value;
	}
	
	public java.util.Date getDate_visite() {
		return date_visite;
	}
	
	public void setHasche_du_fichier(String value) {
		this.hasche_du_fichier = value;
	}
	
	public String getHasche_du_fichier() {
		return hasche_du_fichier;
	}
	
	public void setEtat_du_fichier(String value) {
		this.etat_du_fichier = value;
	}
	
	public String getEtat_du_fichier() {
		return etat_du_fichier;
	}
	
	public void setLes_repertoiresChemin_absolu(crud.Les_repertoires value) {
		if (les_repertoiresChemin_absolu != null) {
			les_repertoiresChemin_absolu.les_fichiers.remove(this);
		}
		if (value != null) {
			value.les_fichiers.add(this);
		}
	}
	
	public crud.Les_repertoires getLes_repertoiresChemin_absolu() {
		return les_repertoiresChemin_absolu;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Les_repertoiresChemin_absolu(crud.Les_repertoires value) {
		this.les_repertoiresChemin_absolu = value;
	}
	
	private crud.Les_repertoires getORM_Les_repertoiresChemin_absolu() {
		return les_repertoiresChemin_absolu;
	}
	
	public String toString() {
		return String.valueOf(getChemin_Absolu());
	}
	
}
