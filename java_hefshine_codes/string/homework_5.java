package string;

public class homework_5 {

	public static void main(String[] args) {
       String s1="avsjddvdjv";
        
		  for (int i = 0; i < s1.length(); i++) 
		     {
		       char ch=s1.charAt(i);	
		       if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			   System.out.println(s1.charAt(i)+"index at i"+i);	
		     }
    }

}
