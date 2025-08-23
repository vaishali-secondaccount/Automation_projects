package This_keyword;
//refer current class constructor using this keyword
public class Test1 {
	Test1(String name)
	{
		System.out.println(name);
	}
	Test1()
	{
		
		this("im from Test1 Parameterized constructor");
		System.out.println("welcome to my space");
	}

	public static void main(String[] args) {
		Test1 t=new Test1();

	}

}
