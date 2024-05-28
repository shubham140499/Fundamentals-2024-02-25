package method_implementation;

public class uppercase_2ndway {

	public static void main(String[] args) {
		String s1="HEfSHine";
		char []ca=s1.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
		   if(ca[i]>='a' && ca[i]<='z')
		   {
			   char ch=ca[i];
			   char caNew=(char)(ch-32);
			   ca[i]=caNew;
		   }
		}
		String s2=new String(ca);
		System.out.println(s2);
	
	}

}
