package array;
public class max_num {
public static void main(String[] args) {
	int []a= {11,33,55,77,99,111};
	int max=Integer.MIN_VALUE;
	int max1=Integer.MIN_VALUE;
	    for(int i=0;i<a.length;i++)
	      {
	    	if(a[i]>max)
	    		max=a[i];
	      }
	      System.out.println("first max num: "+max);
	    for(int i=0;i<a.length;i++)
	      {
	    	if(a[i]!=max && a[i]>max1)
	    		max1=a[i];
	      } 
	   System.out.println();
	   System.out.println("second max num:"+max1);
}
}
