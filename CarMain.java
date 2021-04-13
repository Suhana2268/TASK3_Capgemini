package Demo;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarAttr car1 = new CarAttr();
		car1.setName("Sedan");
		car1.setBrand("Mercedes");
		car1.setColor("Black");
		car1.setSeats(4);
		car1.startCar();
		
		CarAttr car2 = new CarAttr();
		car2.setName("Fortuner");
		car2.setBrand("Toyota");
		car2.setColor("Black");
		car2.setSeats(7);
		car2.startCar();
		
		CarAttr car3 = new CarAttr();
		car3.setName("Ferrari812");
		car3.setBrand("");
		car3.setColor("Silver");
		car3.setSeats(4);
		car3.startCar();
		
	

	}

}
