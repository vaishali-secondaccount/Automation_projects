package Pass_value_refference;

public class test {
 static void change(int x)
 {
	 x=x+10;
	 
 }
	public static void main(String[] args) {
		int num=20;
		change(num);
		System.out.println(num);

	}

}
