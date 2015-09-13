package ro.h.service.database.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;

import ro.h.service.database.connection.DataBaseConnector;
import ro.h.service.database.entity.Product;

public class ProductDAO {

	private ProductDAO(){
		
	}
	
	@SuppressWarnings("deprecation")
	public static void insert(Product product){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.insert(product);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void update(Product product){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.update(product);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void delete(Product product){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.delete(product);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static List<Product> getAll(){
		List<Product> list = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from products");
			q4.addEntity(Product.class);
			list = q4.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static Product getById(String prodId){
		Product product = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from products where prod_id='" + prodId + "'");
			q4.addEntity(Product.class);
			List<Product> list = q4.list();
			if(list != null && !list.isEmpty()){
				product = list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return product;
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static List<Product> getByDesc(String desc){
		List<Product> list = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from products where prod_desc like '%" 
					+ desc + "%'");
			q4.addEntity(Product.class);
			list = q4.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
}
