package numberpattern;

public class myclass4 {

	public static void main(String[] args) {
		System.out.println("kale vinay kalidas  22june2021");
		System.out.println();
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i>=4)
					System.out.print(j+1+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
