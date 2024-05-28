package assignment_exception_july22;

public class exception_handling_using_trycatch {

	public static void main(String[] args) {
		System.out.println("mall in");
		m1();
		System.out.println("mall out");

	}

	private static void m1() {
		System.out.println("shop open");
		try 
		{
			System.out.println(5/0);
		}catch(Exception e)
		{
			System.out.println("somethinf not found");
		}
		System.out.println("shop closed");
		
	}

	
	}