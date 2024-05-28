package assignment_exception_july22;

public class use_finally_cl4 {

	public static void main(String[] args) {
		System.out.println("main in");
		m1();
		System.out.println("main out");

	}

	private static void m1() {
		System.out.println("welcome");
		try
		{
		System.out.println(1/0);
		}catch (Exception e)
		{
			System.out.println(2/0);
		}
		finally
		{
			System.out.println("not welcome");
		}
		
	}

		}