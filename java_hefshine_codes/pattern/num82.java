package june24;

public class num82 {

	public static void main(String[] args) {
		System.out.println("numpattern82");
		System.out.println(" ");
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<10; j++)
			{  
				if(j-i<=0 && j<5)
				{
				System.out.print(i+1);
			
				}
				else if(j+i>=9 )
					System.out.print(i+1);
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}
