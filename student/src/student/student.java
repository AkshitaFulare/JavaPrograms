package student;
import java.lang.String;
public class student {
	
	private int rollNo;
	private String firstName;
	private String lastName;
	private int age;
	private char section;
	student()
	{
		
	}
	student(int rollNo)
	{
		this.rollNo = rollNo;
    }
	student(int rollNo , String firstName ) 
	{
		this.rollNo = rollNo;
		this.firstName = firstName;
	}
	student(int rollNo ,int age )
	{
		this.rollNo = rollNo;
		this.age = age;
	}
	student(int rollNo , char section)
	{
		this.rollNo = rollNo;
		this.section = section;
	} 	
	student(int rollNo, String firstName, String lastName)
	{
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	student(int rollNo, String firstName, String lastName,int age)
	{
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	student(int rollNo, String firstName, String lastName,int age,char section)
	{
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.section = section;
	}
	
    
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
	public char getSection()
	{
		return section;
	}
}

