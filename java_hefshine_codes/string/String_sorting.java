package july17;
public class String_sorting {
public static void main(String[] args) {
		
		 String[] sa= {"aabc","aabd","fr","wr","gth"};
		   
	       for (int i = 0; i < sa.length; i++) 
	       {
			   for (int j = 0; j < sa.length; j++) 
			   {
				    if(i<j && sa[i].length()>sa[j].length())
				      {
				    	  String temp=sa[i];
				    	  sa[i]=sa[j];
				    	  sa[j]=temp;
				       }
				    else if(sa[i].length()==sa[j].length())
				      {
				    	 char ch1=sa[i].charAt(1);
				    	 char ch2=sa[j].charAt(1);
				    	 if(ch1<ch2)
				    	   {
				    		String temp=sa[i];
					    	sa[i]=sa[j];
					    	sa[j]=temp;
				    	  }
				      }
				     
			   }
		   }
	       for (int i = 0; i < sa.length; i++) 
	       {
			    System.out.println(sa[i]);
		   }


	}

}
