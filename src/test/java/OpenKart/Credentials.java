package OpenKart;

public class Credentials {

	protected String name;
	protected String mailID;
	protected String Password;
	protected String gender;
	protected String dateofbirth;
	
	public Credentials()
	{
		this.name="Gurav Gupta";
		this.mailID="Hello@123";
		this.Password="Hello@123";
		this.gender="Male";
		this.dateofbirth="30-09-1998";
	}
	
	public String name() {
		System.out.println(name);
		return name;
	}
	
	public String getMail() {
		System.out.println(mailID);
		return mailID;
	}
	
	public String getPassword() {
		System.out.println(Password);
		return Password;
	}
	public String getGender() {
		
		return gender;
	}
	public String getdateofbirth() {
		
		return dateofbirth;

	}
}
