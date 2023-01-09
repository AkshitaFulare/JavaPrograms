/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;


/**
 * Main class of the Java program.
 */
 
 
 
 
//BEGINS:EXPERIMENT WITH EMPLOYEE:POOR DESIGN
//package sample;
class Employee
{
    int number;
    float salary;
    public int experience;
    int age;
    int Height;

    
    
    void setNumber(int number)
    {
        this.number = number;
    }
    
    public void setSalary(float salary)
    {
        this.salary = salary;
    }

    public void setExperience(int experience)
    {
        this.experience = experience;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public int getNumber()
    {
        return this.number;
    }
    
    public float getSalary()
    {
        return salary;
    }
    
    public int getExperience()
    {
        return experience;
    }
    
    public int getAge()
    {
        return age;
    }
    
    
    public static void demoC()
    {
        System.out.println("Inside demoC()");
    }
    
    
    private void demoB()
    {
        System.out.println("Inside demoB()");
    }
    
    void demoA()
    {
        System.out.println("Inside demoA()");
        demoB();
    }
    
    
   

} //End of employee class

 //Begins:good design

class Employee
{
    private int number;
    private float salary;
    private int experience;
    private int age;

    
    
    public void setNumber(int number)
    {
        this.number = number;
    }
    
    public void setSalary(float salary)
    {
        this.salary = salary;
    }

    public void setExperience(int experience)
    {
        this.experience = experience;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public int getNumber()
    {
        return this.number;
    }
    
    public float getSalary()
    {
        return salary;
    }
    
    public int getExperience()
    {
        return experience;
    }
    
    public int getAge()
    {
        return age;
    }
    
    
    public Employee getHigherExperienced(Employee e)
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

} //End of employee class




