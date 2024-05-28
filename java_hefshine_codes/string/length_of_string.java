package string_repeat_aug27;

import java.io.IOException;
import java.io.StringReader;

public class length_of_string {

	public static void main(String[] args) throws IOException 
	{
		String s="vinay kale";
		StringReader sr=new StringReader(s);
		int length=0;
		while(sr.read()>-1)
		{
			length++;
		}
		System.out.println("lenghth of string: "+length);
	}

}
