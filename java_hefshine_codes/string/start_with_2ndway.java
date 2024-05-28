package method_implementation;
public class start_with_2ndway {
public static void main(String[] args) {
		String s="jbshdvsfr";
		String s1="j";
		int i=0;
		int j=0;
		int count=0;
		while(i<s.length() && j<s1.length())
          {
	          if(s.charAt(i)==s1.charAt(i))
	        	  count++;
	          i++;
	          j++;
	          
          }
		if(count==s1.length())
			System.out.println(true);
		else
			System.out.println(false);
		
	}

}