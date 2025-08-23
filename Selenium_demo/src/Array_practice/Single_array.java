package Array_practice;

public class Single_array {

	public static void main(String[] args) {
		float[] per= {86.7f,98.7f,79};
		float min=per[0];
		for(int i=0;i<per.length;i++)
		{
			if(per[i]<min)
			{
				min=per[i];
			
			}
		}
		System.out.println("Higest percentage="+min);
		

	}

}
// find out second highest number from 10 numbers using array
