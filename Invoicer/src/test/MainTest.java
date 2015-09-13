package test;

import java.math.BigDecimal;

import ro.h.service.database.dao.ClientDAO;
import ro.h.service.database.entity.Client;

public class MainTest {

	public static void main(String[] args) {
		
//		DataBaseConnector connector = DataBaseConnector.getInstance();
//		connector.getSession();
		
		Client c = new Client("081501X4RE82", "Bogdan", "Heim", new BigDecimal("1920331440021"), 
				"Calea Rahovei nr. 303, bloc 66, sc. 2, ap. 69", "0746798378", "0767556787", 
				"heim.bogdan@hotmail.com");
		ClientDAO.insert(c);
		System.out.println(ClientDAO.getById("081501X4RE82").toString());
	}
}
