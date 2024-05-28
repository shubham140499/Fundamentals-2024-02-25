package june24;

public class star84 {

	public static void main(String[] args) {
		System.out.println("star_pattern83");
		System.out.println(" ");
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<5; j++)
			{  
				if(j==2 || i==2)
				System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
