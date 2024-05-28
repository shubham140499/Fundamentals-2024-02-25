package july14;

public class max_occuring_character_hw19_2ndway {

	public static void main(String[] args) {
		String s1="aabbbccc";
		String s2=" ";
		for (int i = 0; i < s1.length(); i++) 
		  {
		     char ch=s1.charAt(i);
		     int rank=0;
		       for (int j = 0; j <=i; j++) 
		         {
			        if(s1.charAt(j)==ch)
				    rank++;
		         }
		     if(rank==1)
			  s2=s2+ch;
	   	  }
		char[] ca=s2.toCharArray();
		int[] na=new int[s2.length()];
		    for (int i = 0; i < s1.length(); i++) 
		      {
			     char ch=s1.charAt(i);
			     int index=0;
			       for (int j = 0; j < ca.length; j++)
			        {
					  if(ca[j]==ch)
						  index=j;
					  
				    }
			      na[index]++;
			} 
		    int maxIndex=0;
		    int maxElement=Integer.MIN_VALUE;
		      for (int i = 0; i < na.length; i++) 
		      {
				  if(na[i]>maxElement)
				  {
					  maxElement=na[i];
					  maxIndex=i;
				  }
			  }
		    
		    System.out.println(maxElement);
		    System.out.println(ca[maxIndex]);
		    
		    
		    
		    

	}

}
