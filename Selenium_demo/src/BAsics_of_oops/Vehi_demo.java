package BAsics_of_oops;
class Vehicle
{
	int speed=70;
}
class car extends Vehicle
{
	int speed=100;
	void showspeed()
	{
		System.out.println("Car normal speed="+speed);//100
		//System.out.println(this.speed);//100
		System.out.println("Vehicle Normal speed="+super.speed);//70
	}
}
public class Vehi_demo {

	public static void main(String[] args) {
		
       car c=new car();
       c.showspeed();
	}

}
