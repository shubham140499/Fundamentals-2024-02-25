package numberpattern;
public class spiral_pattern {
public static void main(String[] args) {
        int n=7;
		int a[][]=new int[n][n];
		int imin=0;
		int jmin=0;
		int imax=a.length-1;
		int jmax=a.length-1;
		
		int counter=n-2;
		
		while(imin<=imax)
		{
		for (int j = jmin; j <= jmax; j++) 
		{
		  a[imin][j]=counter;	
		}
		imin++;
		for (int i = imin; i <=imax; i++) 
		{
		      	a[i][jmax]=counter;
		}
		jmax--;
		for (int j = jmax; j >=jmin; j--) 
		{
		   a[imax][j]=counter;	
		}
		imax--;
		for (int i = imax; i >=imin; i--) 
		{
		    a[i][jmin]=counter;	
		}
		jmin++;
		counter--;
		}
		
		    for (int i = 0; i < a.length; i++) 
		    {
			     for (int j = 0; j < a[i].length; j++) 
			     {
				    System.out.print(a[i][j]+" ");	
				}	
			     System.out.println();
			}

	}

}
