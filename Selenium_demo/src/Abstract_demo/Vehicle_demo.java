package Abstract_demo;
abstract class Vehicle
{
	abstract void no_of_tyre();
	abstract void no_of_seats();
	abstract void run_on();
	void start_stop()
	{
		System.out.println("Vehicle start on fuel and stop with button");
	}
	
}
class Car extends Vehicle
{
	void no_of_tyre()
	{
		System.out.println("4 wheels");
	}
	void no_of_seats()
	{
		System.out.println("5 or 7 seats");
	}
	void run_on()
	{
		System.out.println("Car run on Petrol, disel or battery");
	}
}
class Scooter extends Vehicle
{
	void no_of_tyre()
	{
		System.out.println("2 wheels");
	}
	void no_of_seats()
	{
		System.out.println("2 or 3 seats");
	}
	void run_on()
	{
		System.out.println("Scooter run on Petrol, disel or battery");
	}
}

public class Vehicle_demo {

	public static void main(String[] args) {
		System.out.println("******Car*********");
		Car c=new Car();
		c.no_of_tyre();
		c.no_of_seats();
		c.run_on();
		

	}

}
