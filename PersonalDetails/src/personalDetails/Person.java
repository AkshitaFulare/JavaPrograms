package personalDetails;

import java.lang.String;
public class Person {
 
	private long adharNo;
	private int age;
	private String city;
	
	Person()
	{
		
	}
	Person(long adaharNo)
	{
		this.adharNo = adharNo;
	}
	Person(long adaharNo, int age)
	{
		this.adharNo = adharNo;
		this.age = age;
	}
	Person(long adaharNo, int age , String city)
	{
		this.adharNo = adharNo;
		this.age = age;
		this.city = city;
	}
	public void setAdharNo(long adaharNo)
	{
		this.adharNo = adharNo;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public long getAdharNo()
	{
		return adharNo;
	}
	public int getAge()
	{
		return age;
	}
	public String getCity()
	{
		return city;
	}
	public Person getMinAge(Person p)
	{
		if(this.age < p.age)
        {
            return this;
        }
        else
        {
            return p;
        }

	}
}
