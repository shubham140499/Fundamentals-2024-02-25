package charpattern;

public class char32 {

	public static void main(String[] args) {
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(j+i<=5)
					System.out.print((char)((5-j)+65));
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
