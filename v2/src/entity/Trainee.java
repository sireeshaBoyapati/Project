package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name="bi_trainee")
public class Trainee
  {
	@Id
	@GeneratedValue
	@Column
	int tId;
	
	@Column(length=15)
	String tName;
	@OneToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="trainee_address", joinColumns=@JoinColumn(name="tId"),inverseJoinColumns=@JoinColumn(name="aId"))
	Set<Address> addressSet=new HashSet<>();
		

	
	public Trainee() {}


	public Trainee(String tName) {
		super();
		this.tName = tName;
	}


	public int gettId() {
		return tId;
	}


	public void settId(int tId) {
		this.tId = tId;
	}


	public String gettName() {
		return tName;
	}


	public void settName(String tName) {
		this.tName = tName;
	}


	public Set<Address> getAddressSet() {
		return addressSet;
	}


	public void setAddressSet(Set<Address> addressSet) {
		this.addressSet = addressSet;
	}
	
	
	
    
  }
