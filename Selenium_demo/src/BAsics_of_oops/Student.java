package BAsics_of_oops;

class Student {
	String name;
	static void show(int a)
	{
		System.out.println(a);
		//System.out.println(st.name);
		System.out.println("Hello");
	}
	static
	{
		System.out.println("Hi im block");
	}
	
	public static void main(String[] args) {
		Student st=new Student();
		show(40);		
		
	}

}
