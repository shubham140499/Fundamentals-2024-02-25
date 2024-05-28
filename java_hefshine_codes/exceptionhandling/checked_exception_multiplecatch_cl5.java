package assignment_exception_july22;

public class checked_exception_multiplecatch_cl5 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int [5];
			String s1=null;
			System.out.println(s1.length());
			
		}catch(ArithmeticException e)
		{
			System.out.println("arithmethic eception occur");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch (Exception e)
		{
			System.out.println("parent exception occur");
		}
    System.out.println("rest of code");
	}

}
