package Type_casting;

public class Convert_demo {

	public static void main(String[] args) {
		//widening
		int num=10;
		System.out.println("Value of num="+num);
		float d=num;
		System.out.println("Value of d="+d);
		// Narrowing
		int a=(int)d;
		System.out.println("Value of a="+a);
		
		int val=150;
		byte bt=(byte)val;
		System.out.println(bt);

	}

}
