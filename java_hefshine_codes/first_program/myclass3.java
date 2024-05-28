package firstprogram;

public class myclass3 {

	public static void main(String[] args) {
	   System.out.println("kale vinay kalidas 18june2021");
	int num=12345678;
	int sum=0;
	int counter=0;
	 while(num>0)
	  {
		 int digit=num%10;
		 sum=sum+digit;
		 num=num/10;
		 counter++;
		 
	  }
   System.out.println("sum of digits :"+sum);
   System.out.println("count:"+counter);
	}

}
