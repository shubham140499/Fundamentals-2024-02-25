package string;
public class check_digit {
public static void main(String[] args) {
		   String s1="12345p";
		   boolean allDigit=true;
		   
		   for (int i = 0; i < s1.length(); i++)
		     {
			   char ch=s1.charAt(i);
			   if(ch<48 || ch>57)
			     {
				   allDigit=false;
				   break;
				  
			     }
		     }
            if(allDigit==false)
        	    System.out.println("not only digits");
            else
        	    System.out.println("only digits");
	}

}
