package deadlock;

public class Class1 
{
    public synchronized void first(Class2 class2)
    {
    	System.out.println("c1 1    T1");
    	try {Thread.sleep(100);}catch(Exception e) {}
    	class2.second();
    }
    public synchronized void second()
    {
    	System.out.println("c1 2    T1");
    }
}
