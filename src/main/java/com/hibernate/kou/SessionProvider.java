package com.hibernate.kou;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// This is a Session Provider class
public class SessionProvider {

	private static Session session;
	private static Configuration configuration;
	
	private SessionProvider() { }
	
	static {
		
		configuration = new Configuration()
	    
		.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect")
	    .setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
	    .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/employee")
	    .setProperty("hibernate.connection.username", "root")
	    .setProperty("hibernate.connection.password", "381144")
	    .setProperty("hibernate.show_sql", "true")
	    .setProperty("hibernate.hbm2ddl.auto", "update")
	    
	    //  Mapping Class
	    .addAnnotatedClass(Flowershop.class)
	    .addAnnotatedClass(Manager.class)
	    .addAnnotatedClass(Flower.class);
	}
	
	
	public static Session getSession() {
	
		SessionFactory factory = configuration.buildSessionFactory();
		session = factory.openSession();
		return session;
	}
	
}
