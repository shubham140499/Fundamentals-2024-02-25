package june24;

public class star101 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<9; j++)
			{  
				if( j+i==4 || j+i==8)
				System.out.print("*");
				else if((i==4 && j<5) || (i==0 && j>=5 && j<8))
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
