package july12;

import java.util.Iterator;

public class array_36 {

	public static void main(String[] args) {
		int[]a= {1,2,3,8,1,4,5,6,7,8,9};
		int n=1;
		int m=8;
		int min=Integer.MAX_VALUE;
		   for (int i = 0; i < a.length; i++) 
		   {
			  if(a[i]==n)
			  {
				  for (int j = 0; j < a.length; j++)
				  {int dist=0;
					  if(a[j]==m)
					  {
						  if(i<j)
						  System.out.print(j-i+" ");
						  else
							  System.out.print(i-j+" ");
						  
						  if(dist<min)
							  min=dist;
					  }
				  }
			  }
		   }
		   System.out.print(min);
	}

}
