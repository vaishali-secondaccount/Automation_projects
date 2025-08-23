package Type_casting;
class Test
{
	void show()
	{
		System.out.println("test show");
	}
}
class Test1 extends Test
{
	void display()
	{
		System.out.println("test1 display");
	}
	void show()
	{
		System.out.println("test1 show");
	}
}
class Test2 extends Test1
{
	void display()
	{
		System.out.println("Test2 display");
	}
}

public class Testdemo {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.show();
		Test t=new Test1();// upcasting
		t.show();
		Test1 tt=(Test1)t;// downcasting
		tt.display();
		tt.show();
		
		Test2 ttt=(Test2)tt;
		ttt.display();

	}

}
