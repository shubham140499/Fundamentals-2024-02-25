package june24;

public class num106 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<5; j++)
			{  
				if(j-i<=0)
					if((i+j)%2==0)
				System.out.print("1");
					else
						System.out.print("0");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
    }
  }
