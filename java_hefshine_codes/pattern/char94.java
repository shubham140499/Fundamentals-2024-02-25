package june24;

public class char94 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<5; j++)
			{  
				if(j+i==4 || j==0 || i==0 )
				System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
