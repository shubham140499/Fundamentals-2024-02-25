package july8;

public class rotate_right {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9};
		int temp=a[a.length-1];
		for (int i = a.length-1; i >0; i--) 
		{
		  a[i]=a[i-1];	
		}
      a[0]=temp;
      for (int i = 0; i < a.length; i++)
      {
		System.out.print(a[i]+" ");
	  }
	}

}