package array;
public class reverse_of_array_without_3rdvariable {
public static void main(String[] args) {
		int []a= {11,22,33,44,55,66};
		int i=0,j=a.length-1;
		  System.out.println("original array:");
		for(int l=0;l<a.length;l++)
		 {
			System.out.print(a[l]+" ");
		 }
		while(i<j)
		 {
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			i++;
			j--;
		 }
	  System.out.println();
	  System.out.println("reveysed array:");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
}
