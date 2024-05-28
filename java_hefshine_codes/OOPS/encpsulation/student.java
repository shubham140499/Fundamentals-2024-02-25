package oop_encapsulation_sep_29;

public class student {

	private int fees;
	public void setfees(int newFees) 
	{
	    if(newFees>0)
	    	fees=newFees;
	}
	public int getfees() 
	{
		return fees;
	}
	public static void main(String[] args) 
	{
	
		student s=new student();
		s.setfees(2210);
		
		System.out.println(s.getfees());
	}

}
