package Pass_value_refference;

public class TestPass {

	public static void changepassword(String password)
	{
	password="NewPassword";
	}
	public static void main(String[] args) {
		
	
	String password="OldPassword";
	changepassword(password);// pass reference
	System.out.println("Password method="+password);
	}
}
