package deadlock;

public class T2 extends Thread
{
     Class1 class1;
     Class2 class2;
     
     T2(Class1 class1,Class2 class2)
     {
    	 this.class1=class1;
    	 this.class2=class2;
     }
     public void run() 
     {
		class2.first(class1);
	}
}
