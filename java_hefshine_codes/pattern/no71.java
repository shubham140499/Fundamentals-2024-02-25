package numberpattern;

public class no71 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{   int count=1;
			for(int j=0; j<5; j++)
			{
				if( j-i<=0)
				{
					System.out.print(count++);
					
				}    
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
