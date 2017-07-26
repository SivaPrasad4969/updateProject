package com.javatpoint.mypackage;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class StoreData {
public static void main(String[] args) {
	
	//creating configuration object
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.xml");//populates the data of the configuration file
	
	//creating seession factory object
	SessionFactory factory=cfg.buildSessionFactory();
	
	//creating session object
	Session session=factory.openSession();
	
	//creating transaction object
	Transaction t=session.beginTransaction();
		
	Employee e1=new Employee();
	e1.setId(150);
	e1.setFirstName("sonoo");
	e1.setLastName("jaiswal");
	
	session.persist(e1);//persisting the object
	
	t.commit();//transaction is commited
	session.close();
	
	System.out.println("successfully saved");
	
}
}
