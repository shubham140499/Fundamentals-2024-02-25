package string_repeat_aug27;

public class cipher_hw31 {

	public static void main(String[] args) {
		String s="abcdXYZ";
	//	s=s.toUpperCase();
    //System.out.println(s);
		String s1="";
		String s2="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			ch=(char)(ch-32);
			s1=s1+ch;
		}
		System.out.println(s1);
		
		for (int i = 0; i < s1.length(); i++) 
		{
			s2=s2+(char)(155-s1.charAt(i));		
		}
		System.out.println(s2);
	}

}
