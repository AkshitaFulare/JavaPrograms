package personEmployee;

public class PersonEmployeeMain {

	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.setAdharNo(999908568);
		e1.setAge(30);
		e1.setCity("Bangelore");
		e1.setDeptNm(102);
		e1.setExperience(5);
		e1.setSalary(50000);
		System.out.println("Details of Employee e1"); 
		System.out.println("Adhar No "+e1.getAdharNo());
		System.out.println("Age "+e1.getAge());
		System.out.println("City "+e1.getCity());
		System.out.println("Department "+e1.getDeptno());
		System.out.println("Expericence "+e1.getExperience()+" Years");
		System.out.println("Salary "+e1.getSalary());
		
		System.out.println("\n");
		Employee e2 = new Employee();
		e2.setAdharNo(999908968);
		e2.setAge(25);
		e2.setCity("Noida");
		e2.setDeptNm(108);
		e2.setExperience(3);
		e2.setSalary(80000);
		System.out.println("Details of Employee e2"); 
		System.out.println("Adhar No "+e2.getAdharNo());
		System.out.println("Age "+e2.getAge());
		System.out.println("City "+e2.getCity());
		System.out.println("Department "+e2.getDeptno());
		System.out.println("Expericence "+e2.getExperience()+" Years");
		System.out.println("Salary "+e2.getSalary());
		
		Employee e3 = e1.getHigherExpericemce(e2);
		System.out.println("Higher Experienced "+e3.getExperience()+" Years");
	}

}
