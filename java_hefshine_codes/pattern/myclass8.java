package numberpattern;

public class myclass8 {

	public static void main(String[] args) {
		System.out.println("kale vinay kalidas  22june2021");
		System.out.println();
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
					System.out.print(9-j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
