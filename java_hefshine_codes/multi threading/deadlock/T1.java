package deadlock;

public class T1 extends Thread
{
     Class1 class1;
     Class2 class2;
     
     T1(Class1 class1,Class2 class2)
     {
    	 this.class1=class1;
    	 this.class2=class2;
     }
   
     public void run() 
     {
        class1.first(class2);
        
     }
}
