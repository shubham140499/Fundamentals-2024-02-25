package numberpattern;

public class myclass3 {

	public static void main(String[] args) {
		System.out.println("kale vinay kalidas  22june2021");
		System.out.println();
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i<0 && j+i<9)
					System.out.print(" ");
				else
					System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}

}
