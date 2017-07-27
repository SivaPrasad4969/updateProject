package com.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.DialectFactory;

public class Test {

	public static void main(String[] args) {
	/*	Configuration config=new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		//config.setProperty("dialect", "org.hibernate.dialect.Oracle9Dialect");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();*/
		Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Student s=new Student();
		s.setSid(110);
		s.setSname("seenu");
		session.save(s);
		Transaction transaction=session.beginTransaction();
		session.persist(s);
		//session.merge(s);
		transaction.commit();
		//System.out.println(s2.getSid()+""+s2.getSname());
		session.close();
	}

}
