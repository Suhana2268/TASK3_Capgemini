package Demo;

public class CarAttr {
	CarAttr() {
		System.out.println("Inside Car");
	}
	CarAttr(String name, String color) {
		
	}
	private String name;
	//private int number;
	private String brand;
	private String color;
	private int seats;
	//private String model;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}**/
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	/**public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}**/
	
	public void startCar() {
		System.out.println("start car");
	}
	@Override
	public String toString() {
		return "CarAttr [name=" + name + ", brand=" + brand + ", color=" + color + ", seats=" + seats + ", getName()="
				+ getName() + ", getBrand()=" + getBrand() + ", getColor()=" + getColor() + ", getSeats()=" + getSeats()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

}
