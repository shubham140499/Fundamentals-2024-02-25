package string_repeat_aug23;

public class Digit_contains_or_char {

	public static void main(String[] args) {
		String s="iifbisd21666";
		int digitCount=0;
		int nonDigitCount=0;
		
		
		for (int i = 0; i < s.length(); i++) 
		{
		    if(s.charAt(i)>='0' && s.charAt(i)<='9')
		    	digitCount++;
		    else
		    	nonDigitCount++;
		}
		if(digitCount==s.length())
            System.out.println("all digits");
		else if(nonDigitCount==s.length())
			System.out.println("all characters");
		else
			System.out.println("combination");
	}

}
