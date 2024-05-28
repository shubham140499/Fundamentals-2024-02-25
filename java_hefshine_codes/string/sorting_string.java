package july17;

public class sorting_string {
public static void main(String args) {
	   String[] sa= {"aa","aab","aac","wr","gth"};
	   
	       for (int i = 0; i < sa.length; i++) 
	       {
			   for (int j = i+1; j < sa.length; j++) 
			   {
				     int comNum=sa[i].compareTo(sa[j]);
				    if(comNum<0)
				    {
				    	String temp=sa[i];
				    	sa[i]=sa[j];
				    	sa[j]=temp;
				    }
				     
			   }
		   }
	       for (int i = 0; i < sa.length; i++) 
	       {
			    System.out.println(sa[i]);
		   }
}
}
