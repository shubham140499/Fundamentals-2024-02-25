package string_repeat_aug23;

public class remove_char_from_string {

	public static void main(String[] args) {
		String s="hefshine";
		char []ca=s.toCharArray();
		int count=0;
		for (int i = 0; i < ca.length; i++) 
		{
		    if(ca[i]=='f')
		    	count++;
		    
		}
		char[] caNew=new char[ca.length-count];
		int index=0;
		for (int i = 0; i < ca.length; i++) 
		{
		 if(ca[i]!='f')
			 caNew[index++]=ca[i];
		}
		String sNew=new String(caNew);
		System.out.println(sNew);
	}

}
