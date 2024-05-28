package numberpattern;

public class myclass11 {

	public static void main(String[] args) {
		System.out.println("kale vinay kalidas  22june2021");
		System.out.println();
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i>=4 && i<5)
					System.out.print(i+1+" ");
				else if (j-i>=-4 && i>=5)
					System.out.print(9-i+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
