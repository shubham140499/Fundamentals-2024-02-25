package charpattern;

public class char35 {

	public static void main(String[] args) {
		int counter=0;
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(j-i<=0)
					System.out.print((char)(65+counter++));
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
