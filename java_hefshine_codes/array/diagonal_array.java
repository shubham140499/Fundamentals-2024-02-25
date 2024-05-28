package array;
public class diagonal_array {
public static void main(String[] args) {
		int[][]b={ {1,2,3},
		           {4,1,6},
		           {7,8,1} };
		
		for(int i=0;i<b.length;i++)
		{
			
		   for(int j=0;j<b[i].length;j++)
		    {
			   if(j-i==0 || j+i==2)
		    	System.out.print(b[i][j]+" ");
			   else
				   System.out.print("  ");
		    }
		System.out.println();
		}


	}

}