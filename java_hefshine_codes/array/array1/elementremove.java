package array;
public class elementremove {
public static void main(String[] args) {
		int [] a= {11,22,33,44,55};
		int num=33;
		int counter=0;		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==num)
				counter++;
		}
		System.out.println(num+" element is repeated= "+counter+" times");
		int []b=new int[a.length-counter];
		int index=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=num)
				b[index++]=a[i];
		}
		System.out.println("new array b[i]=");
		for(int k=0;k<b.length ;k++)
		{
		System.out.print(b[k]+" ");	
		}
}
}