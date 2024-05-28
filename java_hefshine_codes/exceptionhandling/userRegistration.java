package assignment_exception_july22;

public class userRegistration {

	  void registerProfie(String username, int age,String country) throws Exception
	  {
		  if(country.compareToIgnoreCase("INDIA")!=0)
		  {
			  throw new InvalidCountryException("onlyIndians");
		  }
		  if(age<18)
		  {
			  throw new InvalidAgeException("ye nahi ho sakta");
		  }
		  System.out.println("congrats");
	  }
}
