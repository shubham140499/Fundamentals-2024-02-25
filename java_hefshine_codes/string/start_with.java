package method_implementation;
public class start_with {
public static void main(String[] args) {
		String s1="hefshine";
		String s2="hef";
		int count=0;
		for (int i = 0; i < s2.length(); i++)
		{
		   if(s1.charAt(i)!=s2.charAt(i))	
		   {
			count++;
			break;
		   }
		   
		}
		if(count==0)
			System.out.println("true");
		else
			System.out.println("False");
	}

}
