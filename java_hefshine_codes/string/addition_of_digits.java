package string;

public class addition_of_digits {

	public static void main(String[] args) {
		String s1="1,2,3,4";
		int sum=sum(s1);
		System.out.println(sum);
	}
		
		private static int sum(String s1) {
		
		int sum=0;
		for (int i = 0; i < s1.length(); i++) 
		{
		 char ch=s1.charAt(i);
		 if(ch>='0' && ch<='9')
			 sum=sum+(ch-48);
		 
		}

	return sum;
	}
}
