package assignment_exception_july22;

import java.io.IOException;

public class checked_eception_using_throw_throws {

	public static void main(String[] args) {
		try
		{
			a();
			
		}catch(IOException e)
		{
			System.out.println("checked exception");
		}

	}

	private static void a() throws IOException
	{
		throw new IOException();
	}

}
