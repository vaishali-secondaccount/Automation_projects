package Wraper_classes;

public class Auto_demo {

	public static void main(String[] args) {
		//Autoboxing (Convert Primitive to wrapper classes)
		int num=10;
		System.out.println("Primitive type of data="+num);// memory allocation for 4 byte
		Integer num1=num;// Convert Primitive int to Object Integer
		System.out.println("Wrap data="+num1);// 
		
		//Unboxing (Convert wrappers to primitive)
		Integer a=20;
		System.out.println("for object="+a);
		int b=a;//Unboxing(Object to primitive)
		System.out.println("For primitive data type in="+b);
		
		String str="12345";
		int ab=Integer.parseInt(str);
		System.out.println(ab);
		
		String n=Integer.toString(num);
		System.out.println(n);

	}

}
