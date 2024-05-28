package synchronization;

public class abcd 
{
	static int count;
     
     public synchronized static void add()
     {
    	 count=count+1;
     }
}
