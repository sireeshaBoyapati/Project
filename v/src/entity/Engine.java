package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="engine1")
public class Engine {

	@Id
	@Column
	int engineId;
	@Column(length=15)
	String type;

	@Column
	int power;
	
	@OneToOne(mappedBy="engine", cascade= {CascadeType.ALL})
	Car car;
	
	public Engine() {}

	public Engine(int engineId, String type, int power) {
		super();
		this.engineId = engineId;
		this.type = type;
		this.power = power;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	public int getEngineId() {
		return engineId;
	}

	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", type=" + type + ", power=" + power + "]";
	}
	
	
	
	
	
	
}
