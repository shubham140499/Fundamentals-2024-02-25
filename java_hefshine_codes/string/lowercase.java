package method_implementation;

public class lowercase {

	public static void main(String[] args) {
		String s1="HEfshine";
		String s2="";
		
		for (int i = 0; i < s1.length(); i++)
		{
		    char ch=s1.charAt(i);
		    if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
		    	ch=(char)(ch+32);
		    s2=s2+ch;
		}
		System.out.println(s2);
	}

}
