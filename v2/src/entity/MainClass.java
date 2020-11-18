package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
	      
		//Creating SessionFactory object
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Trainee.class).addAnnotatedClass(Address.class).buildSessionFactory();
		    
		
		//create Session object using SessionFactory object
		Session session=factory.getCurrentSession();
		Trainee t1=new Trainee("Sumita");
		Address a1=new Address("Sec-15","Noida");
		Address a2=new Address("Sector Zeta","Greater Noida");
		Address a3=new Address("Gomati Nagar","Lucknow");
		
		Set<Address> aSet=new HashSet<>();
		aSet.add(a1);
		aSet.add(a2);
		aSet.add(a3);
		
		t1.setAddressSet(aSet);
		
		a1.setTrainee(t1);
		a2.setTrainee(t1);
		a3.setTrainee(t1);
	   
		
	
		
		session.beginTransaction();
		session.save(a1);
		session.save(a2);
		session.save(a3);
	
		//session.save(t2);
		session.getTransaction().commit();
		
        System.out.println("trainee Objects are persisted!!");
	}


}
