package july14;

public class convert_lowercase_hw27 {

	public static void main(String[] args) {
		String s1="AbCdEf";
		String s2="";
		
		
		// lowercase
		for (int i = 0; i < s1.length(); i++) 
		{
		    char ch=s1.charAt(i);
		    if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
		    	ch=(char)(ch+32);
		    
		    s2=s2+ch;
		}
		System.out.println(s2);
		
		
		
		// uppercase
	/*	for (int i = 0; i < s1.length(); i++) 
		{
		    char ch=s1.charAt(i);
		    if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
		    	ch=(char)(ch-32);
		    
		    s2=s2+ch;
		}
		System.out.println(s2);
		*/ 
		
		
		
	}

}
