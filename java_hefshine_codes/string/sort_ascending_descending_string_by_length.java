package string_repeat_aug26;
public class sort_ascending_descending_string_by_length {
public static void main(String[] args) {
		String []s={"bhbc","fvihqibvf","fviwhdv","efggwrgt","w"};
		
		for (int i = 0; i < s.length; i++) 
		{
		   for (int j = 0; j < s.length; j++) 
		   {
			    if(i<j && s[i].length()>s[j].length())
			    {
			    	String temp=s[i];
			    	s[i]=s[j];
			    	s[j]=temp;
			    }
		   }	
		}
		
		for (int i = 0; i < s.length; i++) 
		{
		    System.out.println(s[i]+" "+s[i].length());	
		}
	}

}

