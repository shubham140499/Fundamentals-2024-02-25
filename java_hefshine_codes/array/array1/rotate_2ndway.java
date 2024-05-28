package july8;

public class rotate_2ndway {
	public static void main(String[] args) {
	int[]a= {1,2,3,4,5,6,7,8,9};
	int start=2;
	int end=6;
	int temp=a[start];
	 for (int i = start; i <end; i++) 
	  {
	    a[i]=a[i+1];	
	  }
        a[end]=temp;
    for (int i = 0; i < a.length; i++)
     {
	   System.out.print(a[i]+" ");
     }
  }
}