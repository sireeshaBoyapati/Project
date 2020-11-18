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
		Trainee t1=new Trainee("Vivek");
		Address a1=new Address("Guntur","AP");
		Address a2=new Address("Vijayawada","AP");
		Address a3=new Address("Banglore","Karnataka");
		
		Set<Address> aSet=new HashSet<>();
		aSet.add(a1);
		aSet.add(a2);
		aSet.add(a3);
		t1.setAddressSet(aSet);
		
		Trainee t2=new Trainee("Anu");
		Set<Address> aSet1=new HashSet<>();
		aSet1.add(a1);
		aSet1.add(a2);
		
		t2.setAddressSet(aSet1);
	   
		
	   	
		session.beginTransaction();
		session.save(t1);
		session.save(t2);
	
		
		session.getTransaction().commit();
		
        System.out.println("trainee Objects are persisted!!");
	}


}
