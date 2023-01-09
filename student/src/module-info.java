package 
class student {
	private int rollNo;
	private string firstName;
	private string lastName;
	private int age;
	private char section;
    
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setSection(char section)
	{
		this.section = section;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public int getAge()
	{
		return age;
	}
	public int getSection()
	{
		return section;
	}
}
