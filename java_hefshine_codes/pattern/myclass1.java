package numberpattern;

public class myclass1 {

	public static void main(String[] args) {
		System.out.println("kale vinay kalidas  22june2021");
		System.out.println();
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
					System.out.print(5-j);
			}
			System.out.println();
		}

	}

}
