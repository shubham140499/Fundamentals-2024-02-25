package string_repeat_aug25;

public class repeat_each_character {

	public static void main(String[] args) {
		String s="abcd";
		String s1="";
		for (int i = 0; i <s.length(); i++) 
		{
		   char ch=s.charAt(i);
		   s1=s1+ch+ch;
		}
		System.out.println(s1);
	}

}
