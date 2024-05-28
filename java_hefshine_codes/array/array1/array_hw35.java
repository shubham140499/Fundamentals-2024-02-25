package july8;

public class array_hw35 {

	public static void main(String[] args) {
		int [] s1= {1,3,5,7,9,11,13};
		int [] s2= {2,4,6,8,10};
		
		 int []s=new int [s1.length+s2.length];
		 int sIndex=0;
		for (int i = 0; i < s1.length || i<s2.length; i++) 
		{
		    	if(i<s1.length)
		    		s[sIndex++]=s1[i];
		    	if(i<s2.length)
		    		s[sIndex++]=s2[i];
		    	
		}
		
		for (int i = 0; i < s.length; i++) 
		{
		    	System.out.print(s[i]+" ");
		}
	}

}
