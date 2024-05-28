package array;
public class min_num {
public static void main(String[] args) {
		int[]a= {11,22,33,44,55,66,77,};
		int min=Integer.MAX_VALUE;
		int min1=Integer.MAX_VALUE;
		  for(int i=0;i<a.length;i++)
		    {
			  if(a[i]<min)
				min=a[i];
		    }
		System.out.println("first min num:"+min);
		  for(int i=0;i<a.length;i++)
		    {
			  if(a[i]!=min && a[i]<min1)
				min1=a[i];
		    }
		System.out.println("second min num:"+min1);
	}
}
