package ManyToManyBIMain;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ManyToManyBI.Cart;
import ManyToManyBI.Items;


public class Main {

	public static void main(String[] args) 
	{
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cart.class).addAnnotatedClass(Items.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		Cart c1 = new Cart("Amazon");
		Cart c2 = new Cart("Flipcart");
		Items i1 = new Items("Washing Machine",11000.00d);
		Items i2 = new Items("AC",37000.00d);
		Items i3 = new Items("Fridge",47000.00d);
		Items i4 = new Items("ReadmeNote9Pro",15000.00d);
		
		List<Items> itemslis =new ArrayList<>();
		itemslis.add(i1);
		itemslis.add(i2);
		itemslis.add(i3);
		c1.setItemslist(itemslis);
	
		List<Cart> cartlis =new ArrayList<>();	
		cartlis.add(c1);
		cartlis.add(c2);
		c2.setItemslist(itemslis);
		
		session.beginTransaction();
		
		/*session.save(c);*/
		session.save(c1);
		session.save(c2);
		
		session.getTransaction().commit();
		
		System.out.println("Object Saved");

	}

}
