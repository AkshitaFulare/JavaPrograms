package Student2;



public class StdtMain {

	public static void main(String[] args) {
		Stdt s1= new Stdt();
		s1.setFirstName("Akshita");
		s1.setLastName("Fulare");
		s1.setAge(20);
		s1.setSection('A');
		Stdt s2 = new Stdt( "Akshat" , "Fulare" , 16 , 'A');
		Stdt s3 = new Stdt( "Tony" , "shark");
        System.out.println(s1.getRollNo()+" "+s1.getFirstName()+" "+s1.getLastName()+" "+s1.getAge()+" "+s1.getSection());
        System.out.println(s2.getRollNo()+" "+s2.getFirstName()+" "+s2.getLastName()+" "+s2.getAge()+" "+s2.getSection());
        System.out.println(s3.getRollNo()+" "+s3.getFirstName()+" "+s3.getLastName()+" "+s3.getAge()+" "+s3.getSection());	

	}

}
