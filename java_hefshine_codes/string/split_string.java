package method_implementation;
public class split_string {
public static void main(String[] args) {
		String s=" full stack devloper";
		
		int spaceCount=0;
		for (int i = 0; i < s.length(); i++) 
		{
		   if(s.charAt(i)==' ')
			   spaceCount++;
		}
		String []sa=new String[spaceCount+1];
		
		String s1="";
		int index=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
		    if(s.charAt(i)!=' ')
		    	s1=s1+s.charAt(i);
		    else
		    {
		    	sa[index++]=s1;
		    	s1="";
		    }
		    if(i==s.length()-1)
		    {
		    	sa[index++]=s1;
		    }
		    	
		}
		for (int i = 0; i < sa.length; i++) 
		{
		    System.out.println(sa[i]);	
		}
	}

}
