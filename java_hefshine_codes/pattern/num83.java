package june24;

public class num83 {

	public static void main(String[] args) {
		System.out.println("numpattern83");
		System.out.println(" ");
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<10; j++)
			{  
				if(j-i<=0)
				{
				System.out.print(j+1);
			
				}
				else if(j+i>=9 )
					System.out.print(i+j-8);
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
