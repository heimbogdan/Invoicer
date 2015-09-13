package ro.h.service.database.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;

import ro.h.service.database.connection.DataBaseConnector;
import ro.h.service.database.entity.Service;

public class ServiceDAO {
	
	private ServiceDAO(){
		
	}
	
	@SuppressWarnings("deprecation")
	public static void insert(Service service){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.insert(service);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void update(Service service){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.update(service);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void delete(Service service){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.delete(service);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static List<Service> getAll(){
		List<Service> list = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from services");
			q4.addEntity(Service.class);
			list = q4.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static Service getByCode(String servCode){
		Service service = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from services where serv_code='" 
					+ servCode + "'");
			q4.addEntity(Service.class);
			List<Service> list = q4.list();
			if(list != null && !list.isEmpty()){
				service = list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return service;
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static List<Service> getByName(String servName){
		List<Service> list = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from services where serv_name like '%" 
					+ servName + "%'");
			q4.addEntity(Service.class);
			list = q4.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
}
