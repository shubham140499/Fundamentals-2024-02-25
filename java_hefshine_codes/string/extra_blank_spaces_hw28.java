package july14;

public class extra_blank_spaces_hw28 {

	public static void main(String[] args) {
	      String s1="somu      gomu      chomu";
		   String s2="";
		
		 for (int i = 0; i < s1.length(); i++) 
		  {
			  if(s1.charAt(i)==' ' && s1.charAt(i+1)==' ')
			  {
				    
			  }
			  else
				  s2=s2+s1.charAt(i);
		  }
		System.out.println(s2);

	}

}
