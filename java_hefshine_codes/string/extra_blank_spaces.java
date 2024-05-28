package string_repeat_aug26;

public class extra_blank_spaces {

	public static void main(String[] args) {
		String s="    vinay     kale    ";
		String s2="";
		s=s.trim();
		for (int i = 0; i < s.length(); i++) 
		{
		     if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
		     {
		    	 
		     }
		     else
		    	 s2=s2+s.charAt(i);
		}
		System.out.println(s2);
	}

}
