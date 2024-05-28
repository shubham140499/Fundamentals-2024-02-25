package assignment_july8;
public class minimum_avg {
	public static void main(String[] args) {
	int[]a= {1,32,43,4,56,7,85,1,9};
	int k=3;
	int minIndex=0;
	int minAvg=Integer.MAX_VALUE;
	for (int i = 0; i < a.length-k; i++)
	{  int sum=0;
	  for (int j = i; j < i+k; j++)
	  {
		 sum=sum+a[j]; 
	  }	
	  if(sum/k<minAvg)
	  {
		  minAvg=sum/k;
		  minIndex=i;
	  }
	}
	System.out.println("min_avg: "+minAvg);
	System.out.println("minindex: "+minIndex);

	}

}
