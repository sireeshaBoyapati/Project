package main;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import entity.*;
public class MainClass
{
	public static void main(String[] args) {
      
		//Creating SessionFactory object
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car.class).addAnnotatedClass(Engine.class).buildSessionFactory();
		
		//create Session object using SessionFactory object
		Session session=factory.getCurrentSession();
		
		Engine e1=new Engine(100,"Diesel",1400);
		Car c1=new Car(1,"Swift");
		c1.setEngine(e1);
		
		session.beginTransaction();
		session.save(c1);
		session.getTransaction().commit();
		System.out.println("Object Saved!!");
        
	}

}
