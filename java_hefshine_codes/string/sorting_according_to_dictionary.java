package string_repeat_aug26;

public class sorting_according_to_dictionary {

	public static void main(String[] args) {
		String []s={"bhbc","fvihqibvf","fviwhdv","efggwrgt","a","ab"};
		
		
		for (int i = 0; i < s.length; i++) 
		{
		   for (int j = 0; j < s.length; j++) 
		   {
			    if(i<j && s[i].compareTo(s[j])>0)
			    {
			    	String temp=s[i];
			    	s[i]=s[j];
			    	s[j]=temp;
			    }
		   }	
		}
		
		for (int i = 0; i < s.length; i++) 
		{
		    System.out.println(s[i]+" ");	
		}
	}

}
