package array;
public class copy_of_array {
public static void main(String[] args) {
		int []a= {11,22,33,44,55,66};
		int[]b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		  System.out.println("original array ");
		for(int i=0;i<a.length;i++)
		  {
				System.out.print(a[i]+" ");
		  }
		  System.out.println();
		  System.out.println("copied array ");
		for(int i=0;i<b.length;i++)
		  {
			System.out.print(b[i]+" ");
		  }
	}
}
