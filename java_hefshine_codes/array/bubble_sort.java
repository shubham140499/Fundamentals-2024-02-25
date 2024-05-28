package assignment_june_7;

public class bubble_sort {

	public static void main(String[] args) {
		int []a= {9,4,6,7,2,8,1,3};
		   for (int i = 0; i < a.length; i++)
		   {   
			   for (int j = 0; j < a.length-1-i; j++)
			     {
				   if(a[j]>a[j+1])
				    {	 
			     
			           int temp=a[j];
			           a[j]=a[j+1];
			           a[j+1]=temp;
				    }
			     }
		   } 
	   
		for (int i = 0; i < a.length; i++) 
		   {
			  System.out.print(a[i]+" ");
		   }

	}

}
