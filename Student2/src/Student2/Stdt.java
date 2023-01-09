package Student2;
import java.lang.String;
public class Stdt {

	    private static int rollNocount = 100;
		private  int rollNo ;
		private String firstName;
		private String lastName;
		private int age;
		private char section;
		Stdt()
		{
			rollNo = rollNocount++;
		}
		Stdt( String firstName ) 
		{
			rollNo = rollNocount++;
			this.firstName = firstName;
		}
		Stdt(int age )
		{
			rollNo = rollNocount++;
			this.age = age;
		}
		Stdt( char section)
		{
			rollNo = rollNocount++;
			this.section = section;
		} 	
		Stdt( String firstName, String lastName)
		{
			rollNo = rollNocount++;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		Stdt( String firstName, String lastName,int age)
		{
			rollNo = rollNocount++;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
		}
		Stdt(String firstName, String lastName,int age,char section)
		{
			rollNo = rollNocount++;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.section = section;
		}
		public int getRollNo()
		{
			return rollNo;
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



