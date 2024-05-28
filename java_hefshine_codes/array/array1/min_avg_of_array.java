package july8;

public class min_avg_of_array {

	public static void main(String[] args) {
		int[]a= {3,7,90,20,5,1,};
		int k=3;
		int minIndex=0;
		int minAvg=Integer.MAX_VALUE;
		for (int i = 0; i < a.length-k+1; i++)
		{
		  int sum=0;
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
       System.out.println(minAvg);
       System.out.println(minIndex);
	}

}
