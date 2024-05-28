package string_repeat_aug25;
public class longest_substring {
public static void main(String[] args) {
		String s="abcvuyveuf";
		int max=Integer.MIN_VALUE;
		int start=0;
		for (int i = 0; i <s.length(); i++) 
		{
		    	for (int j = i+1; j < s.length(); j++) 
		    	{
		    		int count=0;
		    		for (int k = i; k <= j-1; k++) 
		    		{
		    			if(s.charAt(j)==s.charAt(k))
		    				count++;
					 	
					}
		    		if(count>0)
		    		{
		    			int len=j-i;
		    			if(len>max)
		    			{
	
		    				
		    				
		    				max=len;
		    				start=i;
		    			}
		    			break;
		    		}
		    		else if(count==0 && j==s.length()-1)
		    		{
		    			int len=j-i+1;
		    			if(len>max)
		    			{
		    				max=len;
		    				start=i;
		    			}
		    			break;
		    		}
		    		}
		    		
				}
		System.out.println(max);
		for (int i = start; i < start+max; i++) 
		{
		System.out.print(s.charAt(i));	
		}
		
	}
}