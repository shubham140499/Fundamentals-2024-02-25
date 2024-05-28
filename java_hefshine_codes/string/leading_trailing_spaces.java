package string_repeat_aug25;

public class leading_trailing_spaces {

	public static void main(String[] args) {
		String s="     vinay      ";
		String s1="";
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
		
		for (int i = start; i <=end; i++) 
		{
		    s1=s1+s.charAt(i);  	
		}
		System.out.println("original");
		System.out.println(s);
		System.out.println("after removal");
		System.out.println(s1);
	}

}
