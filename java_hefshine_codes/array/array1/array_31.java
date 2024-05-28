package july12;
public class array_31 {
public static void main(String[] args) {
	int[]a= {5,1,3,4,7};
	int s=12;
	     for (int i = 0; i < a.length; i++)
	      {
		    for (int j = i+1; j < a.length; j++)
		      {
			    for (int k = j+1; k < a.length; k++)
			      {
			    	  if(a[i]+a[j]+a[k]<s)
				      System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+(a[i]+a[j]+a[k]));	
				  }	
			  }	
		  }

	}
}