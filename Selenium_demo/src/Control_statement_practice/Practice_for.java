package Control_statement_practice;

public class Practice_for {

	public static void main(String[] args) {
		//1
		//1 2
		//1 2 3
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+ "  ");
//			}
//			System.out.println();
//		}

		//    1
		//   1 1
		//  1 2 1
		// 1 2 2 1
		for(int i=0; i<5;i++)
		{
			int num=1;
			
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(num+ " ");
				num=num*(i-k)/(k+1);
			}
			System.out.println();
		}
	}

}
