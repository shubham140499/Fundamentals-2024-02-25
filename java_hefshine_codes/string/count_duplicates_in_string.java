package string_repeat_aug25;

public class count_duplicates_in_string {

	public static void main(String[] args) {
	   String s="aaabcccdddeeeeee";
	   
	   int count=0;
	   for (int i = 0; i < s.length(); i++) 
	   {
		   for (int j = i+1; j < s.length(); j++) 
		   {
			   if(s.charAt(i)==s.charAt(j))
				   {
				      count++;
				      break;
				   }
		   }
	   }
	   System.out.println("duplicate count: "+count);
	}

}
