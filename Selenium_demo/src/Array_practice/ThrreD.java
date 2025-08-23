package Array_practice;

public class ThrreD {

	public static void main(String[] args) {
		//ref r c
//		int[][][] arr= {{{10,20},{30,40}},// ref 0
//				        {{10,20,30},{10,20,30},{10,20,30,40}}};//ref1
		int[][][] arr=new int[2][3][3];
//		System.out.println(arr[1][2][2]);// 30
		
		for (int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+"  ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
