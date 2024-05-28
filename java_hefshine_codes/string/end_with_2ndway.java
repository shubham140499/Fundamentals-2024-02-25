package method_implementation;

public class end_with_2ndway {

	public static void main(String[] args) {
		String s="jbshdvsfr";
		String s1="fr";
		int i=s.length()-1;
		int j=s1.length()-1;
		int count=0;
		while(i>=0 && j>=0)
          {
	          if(s.charAt(i)==s1.charAt(j))
	        	  count++;
	          i--;
	          j--;
	          
          }
		if(count==s1.length())
			System.out.println(true);
		else
			System.out.println(false);
		
	}

}
