package june24;

public class star102 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<9; j++)
			{  
				if( j-i==0 || j-i==4)
				System.out.print("*");
				else if((i==4 && j>=5 && j<8) || (i==0 && j<5))
				{	
				    System.out.print("*");
					
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
