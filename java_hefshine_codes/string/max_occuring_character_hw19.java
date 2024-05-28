
package july14;

public class max_occuring_character_hw19 {

	public static void main(String[] args) {
		
		String s1="aaabcd";
		int[]array=new int[128];
		
		for (int i = 0; i < s1.length(); i++) 
		 {
		   char ch=s1.charAt(i);
		   int num=ch;
		   array[num]++;
		 
		}
		   int maxElement=Integer.MIN_VALUE;
		   int maxIndex=0;
		   for (int i = 0; i < array.length; i++)
		   {
			   if(array[i]>maxElement)
			   {
				   maxElement=array[i];
				   maxIndex=i;
			   }
		   }
		
		System.out.print("max occuring char is "+(char)maxIndex+" with "+maxElement+" ocurrances");
		
	}

}
