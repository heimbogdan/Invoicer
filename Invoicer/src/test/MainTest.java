package test;

import org.hibernate.boot.model.relational.Database;

import ro.h.service.database.connection.DataBaseConnector;

public class MainTest {

	public static void main(String[] args) {
		
		DataBaseConnector connector = DataBaseConnector.getInstance();
		connector.getSession();
	}
}
