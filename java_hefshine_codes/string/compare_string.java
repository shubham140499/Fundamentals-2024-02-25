package method_implementation;

public class compare_string {

	public static void main(String[] args) {
       String s="abcdhuhiu";
       String s1="abcd";
       System.out.println(s.compareTo(s1));
       int num=0;
       if(s.length()<s1.length())
    	   num=s.length();
       else
    	   num=s1.length();
       int i=0;
       while(num>0)
       {
    	   if(s.charAt(i)!=s1.charAt(i))
    	   {
    		   System.out.println(s.charAt(i)-s1.charAt(i));
    		   break;
    	   }
    	   i++;
    	   num--;
       }
       if(num==0)
       {
    	   System.out.println(s.length()-s1.length());
       }
		   
	}

}
