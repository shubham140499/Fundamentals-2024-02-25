package july14;

import java.util.Arrays;

public class frequancy_of_char_in_string_hw24 {
public static void main(String[] args) {
		   System.out.println("Frequancy of character: ");
		   String s1="aaaaaabbbbcccccdd";
		   String s2="";
		      for (int i = 0; i < s1.length(); i++) 
		      {
				  int rank=0;
				    for (int j = 0; j <=i; j++) 
				    {
					  if(s1.charAt(j)==s1.charAt(i))
						  rank++;
					}
				    if(rank==1)
				    	s2=s2+s1.charAt(i);
				    
			  }
		      char[]ca=s2.toCharArray();
		      int[] na=new int[s2.length()];
		      for (int i = 0; i < s1.length(); i++) 
		     {      char ch=s1.charAt(i);
		    	  int index=0;
				  for (int j = 0; j < ca.length; j++) 
				  {
					  if(ca[j]==ch);
					  index=j;
					  
				  }
				  na[index]++;
			  }
		        int index=0;
		        for (int i = 0; i < na.length; i++) 
		        {
				  	for (int j = i+1; j < na.length; j++) 
				  	{
					  if(na[i]>na[j])
					  {
						  int temp=na[i];
						  na[i]=na[j];
						  na[j]=temp;
						  index=i;
						  
						  char temp1=ca[i];
						  ca[i]=ca[j];
						  ca[j]=temp1;
					  }
					}
				}
		        
		      System.out.println(Arrays.toString(ca));
		      System.out.println(Arrays.toString(na));
	          System.out.println(na[0]);	      
		      

	}

}
