package ManyToManyBI;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.*;


@Entity
@Table(name="MTM_Items")
public class Items 
{
  @Id
  @GeneratedValue
  @Column(length=15)
  int itemId;
  @Column(length=15)
  String itemName;
  @Column(length=15)
  double price;
  
  @ManyToMany(cascade= {CascadeType.ALL})
  List<Cart> cartlist =new ArrayList<>();
  
  public Items() 
  {
	super();
  }
  public Items(String itemName, double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}
   public Items(int itemId, String itemName, double price) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
	this.price = price;
   }
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<Cart> getCartlist() {
		return cartlist;
	}
	public void setCartlist(List<Cart> cartlist) {
		this.cartlist = cartlist;
	}
	
   
  
}
