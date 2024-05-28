package july17;

public class hw_31 {

	public static void main(String[] args) {
		
		String s="abcdXYZ";
		s=s.toUpperCase();
		System.out.println(s);
		String s1="";
		
		    for (int i = 0; i < s.length(); i++) 
		      {
			    char ch=s.charAt(i);
			    char ch1=(char)(155-ch);
			    s1=s1+ch1;
			  }
		    
	    System.out.println(s1);	
	}
}