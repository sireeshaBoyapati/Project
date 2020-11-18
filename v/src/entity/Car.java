package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="car1")
public class Car {
	
	@Id
	@Column
	int carId;
	@Column(length=15)
	String model;
	
	@OneToOne(cascade= {CascadeType.ALL},fetch=FetchType.LAZY)
	@JoinColumn(name="engine_id")
	Engine engine;
	
	
	public Car() {}


	public Car(int carId, String model, Engine engine) {
		super();
		this.carId = carId;
		this.model = model;
		this.engine = engine;
	}
	public Car(int carId, String model) {
		super();
		this.carId = carId;
		this.model = model;
		
	}


	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Car [carId=" + carId + ", model=" + model + ", engine=" + engine + "]";
	}
	
	
	

}
