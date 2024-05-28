package method_implementation;

public class lowercase_2ndway {
public static void main(String[] args) {
		String s1="HEfshine";
		char []ca=s1.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
		   if(ca[i]>='A' && ca[i]<='Z')
		   {
			   char ch=ca[i];
			   char caNew=(char)(ch+32);
			   ca[i]=caNew;
		   }
		}
		String s2=new String(ca);
		System.out.println(s2);
	}

}
