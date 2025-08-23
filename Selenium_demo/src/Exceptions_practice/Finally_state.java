package Exceptions_practice;

public class Finally_state {
public static void main(String[] args) {
	try {
		int[] a=new int[4];
		System.out.println(a[6]);//ArrayIndexOutOfBoundException
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Important code");
	}
	System.out.println("End");
}
}
//Why to use finally?
//to close files or stream
//to release network or connection
//to clear something

//nullpointerexception
//classcastexception
//class not found exception
//illegalargumentexception
//numberformatexception
//unsupportedexception


