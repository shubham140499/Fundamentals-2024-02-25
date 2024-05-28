package july14;

import java.util.Iterator;

public class reverse_string_hw18 {

	public static void main(String[] args) {
		
		String s1="vinay omee rahul santosh rushi";
        String s2="";
		  String[] stringArray=s1.split(" ");
		  for (int i =stringArray.length-1; i >=0; i--)
		  {
			  System.out.print(stringArray[i]+" ");
		  }

	
	}

}
