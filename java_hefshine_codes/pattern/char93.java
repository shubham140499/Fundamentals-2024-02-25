package june24;

public class char93 {

	public static void main(String[] args) {
		System.out.println("char_pattern93");
		System.out.println(" ");
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<9; j++)
			{  
				if(j-i==0 ||j+i==8)
				System.out.print("N");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
