package july12;

public class array_30 {

	public static void main(String[] args) {
		int[]a= {1,1,1,1,1,2,2,3,4};
		int[]n= {1,2,4};
		
		for (int i = 0; i < a.length; i++) 
		{
		  int element=a[i];
		  boolean isPresenrinN=false;
		    for (int j = 0; j < n.length; j++) 
		    {
			   if(n[j]==element)
				   isPresenrinN=true;
			}
		    int rank=0;
		   if(isPresenrinN==true)
		   {
			   for (int j = 0; j <=i; j++)
			   {
				   if(a[j]==element)
					   rank++;
			   }
		   }
		     if(isPresenrinN==false)
		    	 System.out.print(element);
		     else if(isPresenrinN==true && rank>2)
		    	 System.out.print(element+" ");
		   
		}
	}

}
