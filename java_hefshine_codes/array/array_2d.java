package array;
import java.util.Iterator;
public class array_2d {
public static void main(String[] args) {
	int[]a1= {1,2,3};
	int[]a2= {4,1,6};
	int[]a3= {7,8,1};
	int[][]a= {a1,a2,a3};
	for(int i=0;i<a.length;i++)
	{
		
	   for(int j=0;j<a[i].length;j++)
	     {
	    	System.out.print(a[i][j]+" ");
	     }
	   System.out.println();
	}

 }
}