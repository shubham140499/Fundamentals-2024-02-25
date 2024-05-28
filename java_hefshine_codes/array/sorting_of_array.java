package assignment_june_7;

public class sorting_of_array {

	public static void main(String[] args) {
	int []a= {9,4,6,7,2,8,1,3};
	   for (int i = 0; i < a.length; i++)
	   {
		   for (int j = 0; j < a.length; j++)
		   {
			   if(i<j && a[i]>a[j])
			   {
				 int temp=a[i];
				      a[i]=a[j];
				      a[j]=temp;
			   }
			   
		   }
	   }
   
	   for (int i = 0; i < a.length; i++) 
	   {
		  System.out.print(a[i]+" ");
	   }
	}

}
