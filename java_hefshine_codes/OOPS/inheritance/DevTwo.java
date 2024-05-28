package inheritance;

public class DevTwo extends DevOne
{
   void mul(int a,int b)
   {
	   System.out.println("multiplication: "+a*b);
   }
   void div(int a,int b)
   {
	   System.out.println("division: "+a/b);
   }
   
   
   public static void main(String[] args) 
   {
	   DevTwo devtwo=new DevTwo();
	   devtwo.add(10, 20);
	   devtwo.sub(60, 50);
	   devtwo.mul(20, 5);
	   devtwo.div(60, 5);
	   
   }
}
