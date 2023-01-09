/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author 91992
 */
/*
public class Main 
{
    
  

    public static void main(String[] args)
    {
        
        //Employee.demoC();//Class level access for demoC() method
        int num;
        Employee e1;
        e1 = new Employee();
        
        e1.number  = 101;
        e1.salary = 20000;
        e1.experience = 4;
        e1.age = 34;
        e1.demoA();
        //e1.demoB();
        e1.demoC(); //Object level access for demoC() method
        
        
        
        //e1.setNumber(11);
        //e1.setSalary(25000.0f);
        //e1.setExperience(11);
        //e1.setAge(34);
        
//        System.out.print("Employee e1 number "+e1.number", e1 salary"+e1.salary", e1 experience"+e1.experience);
        
        System.out.println("Employee e1 number:"+e1.number);
        System.out.println("Employee e1 salary:"+e1.salary);    
        System.out.println("Employee e1 experience:"+e1.experience);
        System.out.println("Employee e1 experience:"+e1.age);
        
    }

}
*/
public class Main 
{
    
  

    public static void main(String[] args)
    {
        int num;
        Employee e1;
        e1 = new Employee();
        e1.setNumber(11);
        e1.setSalary(25000.0f);
        e1.setExperience(11);
        e1.setAge(34);
        
        Employee e2;
        e2 = new Employee();
        e2.setNumber(15);
        e2.setSalary(20000.0f);
        e2.setExperience(8);
        e2.setAge(31);
        
        num = e1.getNumber();
        
        Employee e3 = e1.getHigherExperienced(e2);
        System.out.println("Experience of higher experienced professional is "+e3.getExperience());
        
        
        
        
        //System.out.print("Employee e1 number "+e1.getNumber()+", e1 salary"+e1.getSalary()+", e1 experience"+e1.getExperience());
        
        System.out.println("Employee e1 number:"+e1.getNumber());
        System.out.println("Employee e1 salary:"+e1.getSalary());    
        System.out.println("Employee e1 experience:"+e1.getExperience());
        
    }
}


