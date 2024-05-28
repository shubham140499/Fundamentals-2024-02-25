package deadlock;

public class Class2 
{
	  public synchronized void first(Class1 class1)
	    {
	    	System.out.println("c2 1    T2");
	    	try {Thread.sleep(100);}catch(Exception e) {}
	    	class1.second();
	    }
	    public synchronized void second()
	    {
	    	System.out.println("c2 2    T2");
	    }
	  
	
}
