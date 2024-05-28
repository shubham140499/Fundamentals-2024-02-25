package array;
public class addition_of_diagonal_elements {
	public static void main(String[] args) {
		int[][]b={ {1,2,3},
				{4,1,6},
				{7,8,1}};
				int sum=0;
				int sum1=0;
				for(int i=0;i<b.length;i++)
				{
					
				   for(int j=0;j<b[i].length;j++)
				    {
					   if(j-i==0 || j+i==2)
				    	sum=sum+b[i][j];
					   if(j-i!=0 && j+i!=2)
						   sum1=sum1+b[i][j];
				    }
				  
				}
				 System.out.println("sum of digonal: "+sum);
				 System.out.println("sum of antidigonal: "+sum1);
	}

}
