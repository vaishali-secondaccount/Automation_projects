package Inheritance_practice;
class Mohan
{
	void surname()
	{
		System.out.println("Sharma");
	}
	void flat()
	{
		System.out.println("2BHK flat");
	}
	void car()
	{
		System.out.println("Baleno car");
	}
}
class Soham extends Mohan
{
	void bike()
	{
		System.out.println("Pulsar");
	}
	void job()
	{
		System.out.println("Automation tester");
	}
}

public class family {

	public static void main(String[] args) {
		Soham son=new Soham();
		System.out.print("Soham ");son.surname();
		
		son.flat();
		son.car();
		son.bike();
		son.job();

	}

}
