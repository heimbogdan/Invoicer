package ro.h.service.database.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;

import ro.h.service.database.connection.DataBaseConnector;
import ro.h.service.database.entity.Client;
import ro.h.service.database.entity.Invoice;

public class InvoiceDAO {

	private InvoiceDAO(){
		
	}
	
	@SuppressWarnings("deprecation")
	public static void insert(Invoice invoice){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.insert(invoice);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void update(Invoice invoice){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.update(invoice);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void delete(Invoice invoice){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.delete(invoice);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static List<Invoice> getAll(){
		List<Invoice> list = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from invoice");
			q4.addEntity(Invoice.class);
			list = q4.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static Invoice getByNumber(String invNumber){
		Invoice invoice = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from invoice where inv_number='" + invNumber + "'");
			q4.addEntity(Invoice.class);
			List<Invoice> list = q4.list();
			if(list != null && !list.isEmpty()){
				invoice = list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return invoice;
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static List<Invoice> getByDate(Date date){
		List<Invoice> list = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from invoice where inv_date='" + date + "'");
			q4.addEntity(Client.class);
			list = q4.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static List<Invoice> getByClientId(String clientId){
		List<Invoice> list = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from invoice where client_id='" + clientId + "'");
			q4.addEntity(Client.class);
			list = q4.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static List<Invoice> getByClient(Client client){
		List<Invoice> list = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from invoice where client_id='" 
					+ client.getClientId() + "'");
			q4.addEntity(Client.class);
			list = q4.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
}
