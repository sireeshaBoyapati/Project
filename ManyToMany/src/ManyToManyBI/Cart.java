package ManyToManyBI;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import java.util.*;

@Entity 
@Table(name="MTM_Cart")
public class Cart 
{ 
  @Id
  @GeneratedValue
  @Column(length=15)
  int cartId;
  @Column(length=15)
  String cName;
  
  @ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="MTM_items_in_cart", joinColumns=@JoinColumn(name="cartId"),inverseJoinColumns=@JoinColumn(name="itemId"))
	List<Items> itemslist =new ArrayList<>();

	public Cart() {
		super();
	}

	public Cart(int cartId, String cName, List<Items> itemslist) {
		super();
		this.cartId = cartId;
		this.cName = cName;
		this.itemslist = itemslist;
	}

	public Cart(String cName) {
		super();
		this.cName = cName;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<Items> getItemslist() {
		return itemslist;
	}

	public void setItemslist(List<Items> itemslist) {
		this.itemslist = itemslist;
	}
  
  
}
