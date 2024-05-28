package string_repeat_aug25;
import java.util.Arrays;
public class duplicates_in_string {
public static void main(String[] args) {
	  String s="aabcdcdc";
	  char []ca=s.toCharArray();
	  System.out.println(Arrays.toString(ca));
	    int count=0;
	  for (int i = 0; i < ca.length; i++) 
	  {
		  for (int j = i+1; j < ca.length; j++) 
		  {
			 if(ca[i]==ca[j])
			 {
				 count++;
				 break;
			 }
		  }
	  }
	  
	  System.out.println(count);
	  char[]b=new char[ca.length-count];
	  int index=0;
	  for (int i = 0; i < ca.length; i++) 
	  {    int rank=1;
		   for (int j = 0; j < index; j++) 
		   {
			 if(b[j]==ca[i])
				 rank++;
		   } 
		   if(rank==1)
		   b[index++]=ca[i];
	  }
	  
	  System.out.println(Arrays.toString(b));
	
	}

}
