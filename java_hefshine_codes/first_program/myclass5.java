package firstprogram;

public class myclass5 {

	public static void main(String[] args) {
		System.out.println("kale vinay kalidas 18jun2021");
		int num1=1234321;
		int num=num1;
		int num2=0;
		 while(num>0)
		 {
			 num2=num2*10;
			 num2=num2+num%10;
			 num=num/10;
			
		 }
     if(num1==num2)
    	 System.out.println("it is a palindrome");
     else
    	 System.out.println("not palindrome");
	}

}
