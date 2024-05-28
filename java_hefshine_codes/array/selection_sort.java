package assignment_june_7;
public class selection_sort {
public static void main(String[] args) {
		int []a= {9,4,6,7,2,8,1,3};
		   for (int i = 0; i < a.length; i++)
		   {   int minWalaIndex=i;
			   for (int j = i+1; j < a.length; j++)
			     {
				   if(a[j]<a[minWalaIndex])
					   minWalaIndex=j;
			     }
			   int temp=a[i];
			       a[i]=a[minWalaIndex];
			       a[minWalaIndex]=temp;
		   } 
	   
		for (int i = 0; i < a.length; i++) 
		   {
			  System.out.print(a[i]+" ");
		   }
    }
}
