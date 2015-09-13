package ro.h.service.database.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;

import ro.h.service.database.connection.DataBaseConnector;
import ro.h.service.database.entity.ServicePrice;

public class ServicePriceDAO {

	private ServicePriceDAO(){
		
	}
	
	@SuppressWarnings("deprecation")
	public static void insert(ServicePrice servicePrice){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.insert(servicePrice);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void update(ServicePrice servicePrice){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.update(servicePrice);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void delete(ServicePrice servicePrice){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.delete(servicePrice);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static List<ServicePrice> getAll(){
		List<ServicePrice> list = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from service_price");
			q4.addEntity(ServicePrice.class);
			list = q4.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static ServicePrice getById(String id){
		ServicePrice servicePrice = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from service_price where id=" + id + "");
			q4.addEntity(ServicePrice.class);
			List<ServicePrice> list = q4.list();
			if(list != null && !list.isEmpty()){
				servicePrice = list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return servicePrice;
	}
}
