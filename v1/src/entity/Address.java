package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m2m_address")
public class Address 
 {
    @Id
    @GeneratedValue
    @Column
	int aId;
    
    @Column(length=15)
    String sector;
    @Column(length=15)
    String city;
 
   
	
    public Address() {}

	public Address(String sector, String city) {
		super();
		this.sector = sector;
		this.city = city;
	}
   

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", sector=" + sector + ", city=" + city + "]";
	}
    
    
	
 } 
