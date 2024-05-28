package oct25_practice;

public class custom_exception_main {

	public static void main(String[] args) throws Exception
	{
		int a=10;
		int b=111;
		if(b<1 || b>100)
		{
			throw new custom_exception("custome exception");
		}
		else
		{
			System.out.println(a/b);
		}
	}

}
