package method_implementation;

public class leading_trailing_space {

	public static void main(String[] args) {
		String s="       vinay       ";
		String s2="";
		 int start=0;
		 int end=s.length()-1;
		while(true)
		{
			if(s.charAt(start)==' ')
				start++;
			else
				break;
		}
		while(true)
		{
			if(s.charAt(end)==' ')
				end--;
			else
				break;
		}
		for (int i = start; i <= end; i++) 
		{
		    	s2=s2+s.charAt(i);
		    	
		}
		System.out.println(s);
		System.out.println(s2);
	}

}