package july8;
public class binary_search {
public static void main(String[] args) {
	int []a= {1,2,3,4,5,6,7,8,9,10,11,12,13};
	int num=5;
	int start=0;
	int end=a.length-1;
	while(true)
	{
		int mid=(start+end)/2;
		if(a[mid]==num)
		  {
			 System.out.print("found at location "+mid);
			 break;
		  }
		else if(num>a[mid])
			   start=mid+1;
		else
			end=mid-1;
		if(start>end)
		 {
			System.out.print("not found");
		    break;
		 }
	}
	
	}

}