package june24;

public class char88 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<5; j++)
			{  
				if(j-i==0 || j+i==4)
				System.out.print("A");
				else
					System.out.print("B");
				
			}
			System.out.println();
		}

	}

}
