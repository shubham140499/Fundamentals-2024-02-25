package july8;
public class sorting_array {
public static void main(String[] args) {
	int []a= {3,4,6,2,1,9,-200,8,7};
	for (int i = 0; i < a.length; i++)
	{  
		int temp=a[i];
		int j=i-1;
	      for (; j >=0; j--) 
	      {
		    if(a[j]>temp)
			   a[j+1]=a[j];
		    else
		    {
			  a[j+1]=temp;
			  break;
		    }
	      }
	   if(j==-1)
	    {
		   a[0]=temp;
	    }
	}
	   for (int i = 0; i < a.length; i++)
	     {
		  System.out.print(a[i]+" ");
	     }
	}
}


