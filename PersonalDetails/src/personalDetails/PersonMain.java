package personalDetails;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setAdharNo(596934851);
		p1.setAge(20);
		p1.setCity("Indore");
		
		Person p2 = new Person();
		p2.setAdharNo(596934851);
		p2.setAge(21);
		p2.setCity("Indore");
		
		System.out.println("Details of Person p1"); 
		System.out.println("Adhar No"+p1.getAdharNo());
		System.out.println("Age"+p1.getAge());
		System.out.println("City"+p1.getCity());
		
		System.out.println("Details of Person p2"); 
		System.out.println("Adhar No"+p2.getAdharNo());
		System.out.println("Age"+p2.getAge());
		System.out.println("City"+p2.getCity());
		
		Person p3 = p1.getMinAge(p2);
		System.out.println("Younger one is "+p3.getAge());

	}

}
