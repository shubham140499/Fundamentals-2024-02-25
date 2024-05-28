package country_exception;

public class UserRegistration {
	public void registerProfile(String name,int age,String country) throws Exception
	{
		if(age<18)
			throw new InvalidAgeException("your not allowed");
		else if(country.compareToIgnoreCase("india")!=0)
			throw new InvalidCountryEXception("foreighners are not allowed");
		else
			System.out.println("congrats "+name);
	}

}
