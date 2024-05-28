package method_implementation;

public class uppercase {

	public static void main(String[] args) {
		String s1="HEfshine";
		String s2="";
		
		for (int i = 0; i < s1.length(); i++)
		{
		    char ch=s1.charAt(i);
		    if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
		    	ch=(char)(ch-32);
		    s2=s2+ch;
		}
		System.out.println(s2);
	
	}

}
