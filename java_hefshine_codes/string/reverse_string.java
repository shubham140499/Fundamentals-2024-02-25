package string_repeat_aug25;

public class reverse_string {

	public static void main(String[] args) {
		  String s="abcd pqr stu xyz";
		  
		  
		  String[]sa=s.split(" ");
		  for (int i = 0; i < sa.length; i++) 
		  {    String s1=sa[i];
		  
			   for (int j = s1.length()-1; j >=0; j--) 
			   {
				  System.out.print(s1.charAt(j));
			   } 
			   System.out.print(" ");
		  }
		  System.out.println();
		  for (int i = s.length()-1; i >=0; i--) 
		  {
			  System.out.print(s.charAt(i));
	   	  }
		
		  System.out.println();
		  String[]sa1=s.split(" ");
		  for (int i = sa1.length-1; i >=0; i--) 
		  {
			  System.out.print(sa1[i]+" ");
	   	  }
		System.out.println();
		
	}

}
