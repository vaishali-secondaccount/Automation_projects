package Inheritance_practice;
class Vehicle 
{
	void start(String st)
	{
		System.out.println("start with "+st);
	}
	void stop(String st)
	{
		System.out.println("Stop with "+st);
	}
}
class Car extends Vehicle
{
	void type_of_car(String type)
	{
		System.out.println(type+" car");
	}
	void no_of_seats(int st)
	{
		System.out.println("Number of seats="+st);
	}
}
class Baleno extends Car
{
	void color(String color)
	{
		System.out.println("Color is="+color);
	}
}
class Ertica extends Car
{
	void color(String color)
	{
		System.out.println("Color is="+color);
	}
}
class Scooter extends Vehicle
{
	void type_of_Scooter(String type)
	{
		System.out.println(type+" Scooter");
	}
	void no_of_seats(int st)
	{
		System.out.println("Number of seats="+st);
	}
}
class Activa extends Scooter
{
	void speed(int sp)
	{
		System.out.println("Speed "+sp);
	}
}

public class Vehicle_family {

	public static void main(String[] args) {
		System.out.println("*********BAleno Car*************");
		Baleno b=new Baleno();
		b.start("Key or buuton");
		b.stop("Key or buuton");
		b.type_of_car("Petrol");
		b.no_of_seats(5);
		b.color("Blue");
		
		System.out.println("*********Ertica Car*************");
		Ertica b1=new Ertica();
		b1.start("Key or buton");
		b1.stop("Key or buuton");
		b1.type_of_car("Petrol and diesel");
		b1.no_of_seats(7);
		b1.color("White");
		
		System.out.println("*********Activa Scooter*************");
		Activa b2=new Activa();
		b2.start("Key , kick or buton");
		b2.stop("Key or buton");
		b2.type_of_Scooter("Petrol");
		b2.no_of_seats(2);
		b2.speed(225);
		

	}

}
