package numberpattern;

public class myclass20 {

	public static void main(String[] args) {
		System.out.println("kale vinay kalidas  22june2021");
		System.out.println();
		int counter=1;
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
					System.out.print(counter+++" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
