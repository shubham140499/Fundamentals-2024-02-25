package assignment_exception_july22;

public class hw8 {

	public static void main(String[] args) {
		hwdemo demo=new hwdemo();
		int result=0;
		try
		{
			result=demo.division(9,0);
			
		}catch(Exception e)
		{
			System.out.println("okkk");
		}
        finally 
        {
        	System.out.println(result);
        }
	}

}
