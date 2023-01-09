package student;

public class main {
	public static void main(String[] args)
	{
		student s1;
		s1 = new student();
		s1.setRollNo(101);
		s1.setFirstName("Akshita");
        s1.setLastName("Fulare");
        s1.setAge(20);
        s1.setSection('A');
        student s2 = new student(102, "Akshat" , "Fulare" , 16 , 'A');
        student s3 = new student(103, "Tony" , "shark");
        System.out.println(s1.getRollNo()+" "+s1.getFirstName()+" "+s1.getLastName()+" "+s1.getAge()+" "+s1.getSection());
        System.out.println(s2.getRollNo()+" "+s2.getFirstName()+" "+s2.getLastName()+" "+s2.getAge()+" "+s2.getSection());
        System.out.println(s3.getRollNo()+" "+s3.getFirstName()+" "+s3.getLastName()+" "+s3.getAge()+" "+s3.getSection());
	}	
}
