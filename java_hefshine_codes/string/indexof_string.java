package method_implementation;

public class indexof_string {

	public static void main(String[] args) {
		String s="abcabdjbascjjh";
		String s1="jj";
		int index=0;
		int count=0;
		
		for (int i=0; i < s.length()-s1.length()+1; i++) 
		{
			count=0;
			for (int j = 0,k=i; j < s1.length(); j++,k++) 
			{
				
			
		    	if(s.charAt(k)==s1.charAt(j))
		    	{
		    		count++;
		    		index=i;
		    	}
			}		
			if(count==s1.length())
		      {
		        System.out.println("found  at index:  "+index);
		    	break;
		      }
			}
		
	}

}
