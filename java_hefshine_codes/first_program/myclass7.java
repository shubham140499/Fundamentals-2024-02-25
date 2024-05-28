package firstprogram;

public class myclass7 {

	public static void main(String[] args) {
		System.out.println("kale vinay kalidas 18jun2021");

		int num=7;
		boolean thisnumberisprime=true;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
				thisnumberisprime=false;
				
		}
		System.out.println(thisnumberisprime);
	}

}
