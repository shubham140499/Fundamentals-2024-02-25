package numberpattern;

public class myclass13 {

	public static void main(String[] args) {
		System.out.println("kale vinay kalidas  22june2021");
		System.out.println();
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j+i>=8)
					System.out.print(i+j-7+" ");
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
