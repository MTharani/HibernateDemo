package com.edu1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Mainapp {

	public static void main(String[] args) {
		//Employee eob=new Employee();
		//eob.setEid(1);
		//eob.setEname("thara");
		//eob.setEsalary(8563.23);
		
        Configuration conn=new Configuration().configure().addAnnotatedClass(Employee.class);	
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
        SessionFactory sf=conn.buildSessionFactory(reg);
        Session sess=sf.openSession();
       Transaction tx=sess.beginTransaction();
        Employee s=(Employee) sess.get(Employee.class, 1);
        System.out.println(s);
        //sess.save(eob);
        tx.commit();
        		
	}

}


