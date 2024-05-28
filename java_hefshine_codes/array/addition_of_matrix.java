package assignment_june_7;
public class addition_of_matrix {
public static void main(String[] args) {
		int[][]a= {
				{10,20,30},
				{30,20,10},
				{40,50,60}
		          };
		int[][]b= {
				{1,2,3},
				{6,5,4},
				{9,8,7}
		           };
		int [][]c=new int[3][3];
		
	       for(int i=0;i<a.length;i++)
	         {
	    	   for(int j=0;j<a[i].length;j++)
	    	   c[i][j]=a[i][j]+b[i][j];
	    	 }
	       for(int i=0;i<a.length;i++)
	        {
	    	   for(int j=0;j<a[i].length;j++)
	    	    {
                  System.out.print(c[i][j]+" ");
	    	    }
	    	      System.out.println();
	        }
    }
}
