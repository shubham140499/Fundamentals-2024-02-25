package deadlock;

public class myClass {

	public static void main(String[] args) {
	Class1 class1=new Class1();
	Class2 class2=new Class2();
	T1 t1=new T1(class1,class2);
	t1.start();
	T2 t2=new T2(class1,class2);
	t2.start();
	}

}
