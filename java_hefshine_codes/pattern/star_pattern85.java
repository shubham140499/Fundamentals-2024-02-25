package june24;

public class star_pattern85 {

	public static void main(String[] args) {
		System.out.println("star_pattern85");
		System.out.println(" ");
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<5; j++)
			{  
				if(j==2 || i==2)
				System.out.print("*");
				else
					System.out.print("O");
				
			}
			System.out.println();
		}
	}

}
