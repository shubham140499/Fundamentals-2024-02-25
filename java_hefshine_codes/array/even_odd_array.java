package array;
public class even_odd_array {
public static void main(String[] args) {
		int[]a= {11,22,33,44,55,66,77,88,99};
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
            evencount++;
			else 
			  oddcount++;
		}
         int []even=new int[evencount];
         int []odd=new int[oddcount];
         int evenindex=0;
         int oddindex=0;
           for(int i=0;i<a.length;i++)
           {
        	   if(a[i]%2==0)
        		    even[evenindex++]=a[i];
        	   else
        		    odd[oddindex++]=a[i];
           }System.out.println("even no in array:");
           for(int k=0;k<evencount;k++)
           {
        	   System.out.print(even[k]+" ");
           } 
           System.out.println();
           System.out.println("odd no in array:"); 
           for(int l=0;l<oddcount;l++)
           {
        	   System.out.print(odd[l]+" ");
           }
	}

}
