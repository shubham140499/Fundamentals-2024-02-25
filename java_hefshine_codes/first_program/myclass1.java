package firstprogram;

public class myclass1 {

	public static void main(String[] args) {
		System.out.println("kale vinay kalidas 18jun2021");
		int units=230;
		double bill;
		
		if(units<=50)
		{
			bill=units*0.5;
		}
		else if(units<=150)
		{
			bill=50*0.5+((units-50)*0.75);
		}
		else if(units<=250)
		{
			bill=50*0.5+100*0.75+((units-150)*1.2);
		}
		else
		{
			bill=50*0.5+100*0.75+100*1.2+((units-250)*1.5);
		}
		double finalBill=1.2*bill;
		System.out.println("final bill is:"+finalBill);
	}

}
