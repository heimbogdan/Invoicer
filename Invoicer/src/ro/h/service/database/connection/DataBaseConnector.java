package ro.h.service.database.connection;

import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.cfg.Configuration;

public class DataBaseConnector {

	private static DataBaseConnector instance;
	
	private SessionFactory factory;
	
	private DataBaseConnector() {
		try {
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			factory=cfg.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DataBaseConnector getInstance() {
		if (instance == null) {
			instance = new DataBaseConnector();
		}
		return instance;
	}
	
	public static void closeConnection(){
		instance = null;
	}

	public StatelessSession getSession() {
		return this.factory.openStatelessSession();
	}
}
