package july7;
public class remove_duplicate_elements {
public static void main(String[] args) {
		int[]a= {1,1,1,2,2,2,3,4,5,5};
		int counter=0;
		for (int i = 0; i < a.length; i++)
		{
		    for (int j = i+1; j < a.length; j++)
		    {
				if(a[i]==a[j])
				{
					counter++;
					break;
				}
			}	
		}

		int []b=new int[a.length-counter];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{    int rank=1;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
					rank++;
			}
			if(rank==1)
			{
				b[index]=a[i];
				index++;
			}
		}
		System.out.println("original array: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}    System.out.println();
		     System.out.println("new array ");
	    for (int i = 0; i < b.length; i++)
		  {
			 System.out.print(b[i]+" ");
		  }
	
    } 
}