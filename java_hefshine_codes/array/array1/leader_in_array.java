package july7;

public class leader_in_array {

	public static void main(String[] args) {
		int []a= {9,2,4,6,1,7,3,5};
		
		for (int i = 0; i < a.length; i++) 
		{  int count=0;
		   for (int j =i+1; j < a.length; j++)
		   {
			  if(a[j]>=a[i])
				  count++;
		   }	
		   if(count==0)
           System.out.print(a[i]+" ");
		   
		   }
	}

}
