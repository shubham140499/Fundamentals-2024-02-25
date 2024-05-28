package june24;

public class num108 {

	public static void main(String[] args) {
		int count=1;
		for(int i=0; i<5; i++)
		{  
			for(int j=0; j<5; j++)
			{  
				if(j-i==0)
				{
					System.out.print(count);
				     count++;
				}
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}

}
