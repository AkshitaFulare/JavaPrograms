package multiLevelInheritance;

public class EmployeeM {
	
	private int deptNo;
	private int experience;
	private long salary;
	
	EmployeeM()
	{
		deptNo = 101;
	}
	EmployeeM(int deptNo)
	{
		this.deptNo = deptNo;
	}
	EmployeeM(int deptNo,int experience)
	{
		this.deptNo = deptNo;
		this.experience = experience;
	}
	EmployeeM(int deptNo,int experience,long salary)
	{
		this.deptNo = deptNo;
		this.experience = experience;
		this.salary = salary;
	}
	public void setDeptNm(int deptNo)
	{
		this.deptNo = deptNo;
	}
	public void setExperience(int experience)
	{
		this.experience = experience;
	}
	public void setSalary(long salary)
	{
		this.salary = salary;
	}
	public int getDeptno()
	{
		return deptNo;
	}
	public int getExperience()
	{
		return experience;
	}
    public long getSalary()
    {
    	return salary;
    }
    public EmployeeM getHigherExpericemce(EmployeeM e)
	{
		if(this.experience > e.experience)
        {
            return this;
        }
        else
        {
            return e;
        }

	}
}
