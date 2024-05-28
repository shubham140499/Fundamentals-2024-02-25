package array;

public class index {

	public static void main(String[] args) {
	int [] a= {11,22,33,44,55};
	int element=55;
	boolean ispresent=false;
	int index=0;
	for(int i=0; i<a.length; i++)
	{
		if(a[i]==element)
		{
			ispresent=true;
			index=i;
		}
    }
        if(ispresent)
    	   System.out.println("yes at index: "+index);
        else
    	   System.out.println("not present");
	}
}
