package june24;

public class num109 {

	public static void main(String[] args) {
		System.out.println("num_pattern109");
		System.out.println(" ");
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<5; j++)
			{  
				if(j+i>=4)
				System.out.print(i+1);
				else
					System.out.print(1);
				
			}
			System.out.println();
		}

	}

}
