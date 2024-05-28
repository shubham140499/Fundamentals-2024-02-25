package july8;

public class positive_negative {

	public static void main(String[] args) {
		int[]a= {1,-1,2,-2,3,-3,4,-4};
		
		for (int i = 0; i < a.length; i++)
		{
		   for (int j = 0; j < a.length; j++) 
		   {
			 if(i<j && a[i]<0 && a[j]>0)
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
