package string;
public class remove_specific_from_string_way2 {
public static void main(String[] args) {
		String s1="hefshine";
		char []ca={'e','s'};
		String s2="";
	   	  for (int i = 0; i < s1.length(); i++)
		    {
		       char ch=s1.charAt(i);
		       int counter=0;
		       for (int j = 0; j < ca.length; j++)
		         {
				    if(ca[j]==ch)
					counter++;
			     }
		       if(counter==0)
		    	   s2=s2+ch;
		    	   
		    }
     
	   	  System.out.print(s2);
	}
}
