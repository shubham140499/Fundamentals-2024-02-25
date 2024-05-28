package assignment_exception_july22;

public class unchecked_exception_cl3 {

	public static void main(String[] args) {
		System.out.println("main gate in");
		m1();
		System.out.println("main gate out");

	}

	private static void m1() {
		System.out.println("cabin in");
		m2();
		System.out.println("cabin out");
		
	}

	private static void m2() {
		System.out.println("canteen is on");
		try {
		System.out.println(9/0);
		}catch (Exception e) 
		{
			System.out.println("canteen maintainance");
		}
        System.out.println("canteen is off");		
	}

	}