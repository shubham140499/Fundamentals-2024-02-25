package charpattern;

public class char27 {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i<=0 && i<5)
					System.out.print((char)(i+65));
			
				else if (j+i<=8 && i>=5)
				System.out.print((char)(8-i+65));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
