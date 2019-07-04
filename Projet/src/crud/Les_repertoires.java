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

public class Les_repertoires {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Les_repertoires.class);
	public Les_repertoires() {
	}
	
	public static Les_repertoires loadLes_repertoiresByORMID(String chemin_absolu) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return loadLes_repertoiresByORMID(session, chemin_absolu);
		}
		catch (Exception e) {
			_logger.error("loadLes_repertoiresByORMID(String chemin_absolu)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires getLes_repertoiresByORMID(String chemin_absolu) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return getLes_repertoiresByORMID(session, chemin_absolu);
		}
		catch (Exception e) {
			_logger.error("getLes_repertoiresByORMID(String chemin_absolu)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires loadLes_repertoiresByORMID(String chemin_absolu, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return loadLes_repertoiresByORMID(session, chemin_absolu, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLes_repertoiresByORMID(String chemin_absolu, org.hibernate.LockMode lockMode)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires getLes_repertoiresByORMID(String chemin_absolu, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return getLes_repertoiresByORMID(session, chemin_absolu, lockMode);
		}
		catch (Exception e) {
			_logger.error("getLes_repertoiresByORMID(String chemin_absolu, org.hibernate.LockMode lockMode)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires loadLes_repertoiresByORMID(PersistentSession session, String chemin_absolu) throws Exception {
		try {
			return (Les_repertoires) session.load(crud.Les_repertoires.class, chemin_absolu);
		}
		catch (Exception e) {
			_logger.error("loadLes_repertoiresByORMID(PersistentSession session, String chemin_absolu)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires getLes_repertoiresByORMID(PersistentSession session, String chemin_absolu) throws Exception {
		try {
			return (Les_repertoires) session.get(crud.Les_repertoires.class, chemin_absolu);
		}
		catch (Exception e) {
			_logger.error("getLes_repertoiresByORMID(PersistentSession session, String chemin_absolu)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires loadLes_repertoiresByORMID(PersistentSession session, String chemin_absolu, org.hibernate.LockMode lockMode) throws Exception {
		try {
			return (Les_repertoires) session.load(crud.Les_repertoires.class, chemin_absolu, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLes_repertoiresByORMID(PersistentSession session, String chemin_absolu, org.hibernate.LockMode lockMode)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires getLes_repertoiresByORMID(PersistentSession session, String chemin_absolu, org.hibernate.LockMode lockMode) throws Exception {
		try {
			return (Les_repertoires) session.get(crud.Les_repertoires.class, chemin_absolu, lockMode);
		}
		catch (Exception e) {
			_logger.error("getLes_repertoiresByORMID(PersistentSession session, String chemin_absolu, org.hibernate.LockMode lockMode)", e);
			throw new Exception(e);
		}
	}
	
	public static List queryLes_repertoires(String condition, String orderBy) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return queryLes_repertoires(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryLes_repertoires(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static List queryLes_repertoires(String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return queryLes_repertoires(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryLes_repertoires(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires[] listLes_repertoiresByQuery(String condition, String orderBy) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return listLes_repertoiresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listLes_repertoiresByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires[] listLes_repertoiresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return listLes_repertoiresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listLes_repertoiresByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static List queryLes_repertoires(PersistentSession session, String condition, String orderBy) throws Exception {
		StringBuffer sb = new StringBuffer("From crud.Les_repertoires as Les_repertoires");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static List queryLes_repertoires(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		StringBuffer sb = new StringBuffer("From crud.Les_repertoires as Les_repertoires");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Les_repertoires", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires[] listLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy) throws Exception {
		try {
			List list = queryLes_repertoires(session, condition, orderBy);
			return (Les_repertoires[]) list.toArray(new Les_repertoires[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires[] listLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		try {
			List list = queryLes_repertoires(session, condition, orderBy, lockMode);
			return (Les_repertoires[]) list.toArray(new Les_repertoires[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires loadLes_repertoiresByQuery(String condition, String orderBy) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return loadLes_repertoiresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadLes_repertoiresByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires loadLes_repertoiresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return loadLes_repertoiresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLes_repertoiresByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires loadLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy) throws Exception {
		Les_repertoires[] les_repertoireses = listLes_repertoiresByQuery(session, condition, orderBy);
		if (les_repertoireses != null && les_repertoireses.length > 0)
			return les_repertoireses[0];
		else
			return null;
	}
	
	public static Les_repertoires loadLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		Les_repertoires[] les_repertoireses = listLes_repertoiresByQuery(session, condition, orderBy, lockMode);
		if (les_repertoireses != null && les_repertoireses.length > 0)
			return les_repertoireses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLes_repertoiresByQuery(String condition, String orderBy) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return iterateLes_repertoiresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateLes_repertoiresByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static java.util.Iterator iterateLes_repertoiresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		try {
			PersistentSession session = crud.DoublonsPersistentManager.instance().getSession();
			return iterateLes_repertoiresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateLes_repertoiresByQuery(String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static java.util.Iterator iterateLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy) throws Exception {
		StringBuffer sb = new StringBuffer("From crud.Les_repertoires as Les_repertoires");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static java.util.Iterator iterateLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws Exception {
		StringBuffer sb = new StringBuffer("From crud.Les_repertoires as Les_repertoires");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Les_repertoires", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateLes_repertoiresByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new Exception(e);
		}
	}
	
	public static Les_repertoires createLes_repertoires() {
		return new crud.Les_repertoires();
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
			crud.Les_fichiers[] lLes_fichierss = les_fichiers.toArray();
			for(int i = 0; i < lLes_fichierss.length; i++) {
				lLes_fichierss[i].setLes_repertoiresChemin_absolu(null);
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
			crud.Les_fichiers[] lLes_fichierss = les_fichiers.toArray();
			for(int i = 0; i < lLes_fichierss.length; i++) {
				lLes_fichierss[i].setLes_repertoiresChemin_absolu(null);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == crud.ORMConstants.KEY_LES_REPERTOIRES_LES_FICHIERS) {
			return ORM_les_fichiers;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String chemin_absolu;
	
	private java.util.Date date_Visite;
	
	private java.util.Set ORM_les_fichiers = new java.util.HashSet();
	
	public void setChemin_absolu(String value) {
		this.chemin_absolu = value;
	}
	
	public String getChemin_absolu() {
		return chemin_absolu;
	}
	
	public String getORMID() {
		return getChemin_absolu();
	}
	
	public void setDate_Visite(java.util.Date value) {
		this.date_Visite = value;
	}
	
	public java.util.Date getDate_Visite() {
		return date_Visite;
	}
	
	private void setORM_Les_fichiers(java.util.Set value) {
		this.ORM_les_fichiers = value;
	}
	
	private java.util.Set getORM_Les_fichiers() {
		return ORM_les_fichiers;
	}
	
	public final crud.Les_fichiersSetCollection les_fichiers = new crud.Les_fichiersSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_LES_REPERTOIRES_LES_FICHIERS, crud.ORMConstants.KEY_LES_FICHIERS_LES_REPERTOIRESCHEMIN_ABSOLU, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getChemin_absolu());
	}
	
}
