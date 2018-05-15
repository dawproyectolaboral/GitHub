package com.dawes.util;

import org.hibernate.SessionFactory;
import com.dawes.dao.genericDAO;
import com.dawes.daoImp.genericDAOImp;

public class MySqlDAOFactory {
	
	private  SessionFactory sf;

	
	public MySqlDAOFactory() {

		try {
			sf= HibernateUtility.getSessionFactory();
		} catch (Throwable ex) {

			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public genericDAO getGenericDAO() {
		return new genericDAOImp(sf);
	}

}
