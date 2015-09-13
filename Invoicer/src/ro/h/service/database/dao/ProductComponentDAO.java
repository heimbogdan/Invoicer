package ro.h.service.database.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;

import ro.h.service.database.connection.DataBaseConnector;
import ro.h.service.database.entity.ProductComponent;

public class ProductComponentDAO {

	private ProductComponentDAO(){
		
	}
	
	@SuppressWarnings("deprecation")
	public static void insert(ProductComponent prodComp){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.insert(prodComp);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void update(ProductComponent prodComp){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.update(prodComp);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void delete(ProductComponent prodComp){
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Transaction transaction = session.beginTransaction();
		try {
			session.delete(prodComp);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static List<ProductComponent> getAll(){
		List<ProductComponent> list = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from prod_components");
			q4.addEntity(ProductComponent.class);
			list = q4.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static ProductComponent getById(String compId){
		ProductComponent prodComp = null;
		DataBaseConnector conn = DataBaseConnector.getInstance();
		StatelessSession session = conn.getSession();
		try {
			session.connection().setAutoCommit(true);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			SQLQuery q4 = session.createSQLQuery("select * from prod_components where comp_id='" 
					+ compId + "'");
			q4.addEntity(ProductComponent.class);
			List<ProductComponent> list = q4.list();
			if(list != null && !list.isEmpty()){
				prodComp = list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return prodComp;
	}
}
