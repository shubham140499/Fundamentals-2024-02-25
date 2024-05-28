package june24;
public class kaprekar_num {
public static void main(String[] args) {
		
		int n=99;
		int originaln=n;
		int sq=n*n;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
				int den=(int)Math.pow(10, count);
        		int firstpart=sq/den;
        		int secondpart=sq%den;
		
		         	if(firstpart+secondpart==originaln)
		         		System.out.print("kaprekar number");
					else
					    System.out.print("not kaprekar number ");
				 
			System.out.println();
		}
}