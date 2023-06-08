package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		try {
			Configuration cfg= new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory factory=cfg.buildSessionFactory();
			
			Student st=new Student();
			st.setUid(300);
			st.setName("jitesh");
			st.setCity("agra");
			st.setSalary(500);
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(st);
			tx.commit();
			System.out.println("Data inserted successfully...!");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
