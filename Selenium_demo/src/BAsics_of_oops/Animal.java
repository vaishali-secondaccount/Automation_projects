package BAsics_of_oops;

public class Animal {
	void details(String name)
	{
		System.out.println(name);
	}
    Animal(String name)// default constructor by user
    {
    	System.out.println(name);
    }
	public static void main(String[] args) {
		System.out.println("***Constructor call**********");
		Animal dog=new Animal("Dusky");
		Animal cat=new Animal("Lucy");
		System.out.println("*Method call*********");
		dog.details("Max");
		dog.details("Jimmy");

	}

}
