package assignment_june_7;

public class multiplication_of_matrix {

	public static void main(String[] args) {
		int[][]a= {
				{10,20,30},
				{30,20,10}
		          };
		int[][]b= {
				{1,2},
				{6,5},
				{9,8}
		           };
		int [][]c=new int[a.length][a.length];
		for (int i=0;i<c.length;i++)
		{
			for(int  j=0;j<c.length;j++)
			{
				for(int k=0;k<b.length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
					
		    }
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
