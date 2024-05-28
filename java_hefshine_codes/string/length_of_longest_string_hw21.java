
package july14;
public class length_of_longest_string_hw21 {
public static void main(String[] args) {
		String s1="abcdefghaszf";
		int maxLen=Integer.MIN_VALUE;
		 
		  for (int i = 0; i < s1.length(); i++) 
		  {
			    for (int j = i+1; j < s1.length(); j++) 
			    {
				  char jch=s1.charAt(j);
				  int counter=0;
				    for (int k = i; k < j-1; k++) 
				      {
					     if(s1.charAt(k)==jch)
						 counter++;
					 
					  }
				    if(counter>0)
				    {
				    	    if(j-i>maxLen)
				    		maxLen=j-i;
				    	    break;
				    }
				    if(j-i+1>maxLen)
				    {
				    	maxLen=j-i+1;
				        break;
				    }
				}
		  }
		  System.out.println(maxLen);
		}
     
}
