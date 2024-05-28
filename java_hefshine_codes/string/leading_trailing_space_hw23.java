package july14;

public class leading_trailing_space_hw23 {

	public static void main(String[] args) {
		String s1="           vinay             ";
		String s2="";
		int start=0;
		int end=s1.length()-1;
		
		
		   while(true)
		   {
			   if(s1.charAt(start)==' ')
				  start++;
			   else
				   break;
		   }
		   while(true)
		   {
			   if(s1.charAt(end)==' ')
				  end--;
			   else
				   break;
		   }
		       for (int i = start; i <= end; i++)
		       {
				  s2=s2+s1.charAt(i); 
			   }
		   System.out.println(s1);
		   System.out.println(s2);
		   

	}

}
