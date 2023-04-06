package polymorphism;
 class Employee { 
    int employeeId;
    String employeeName;
    double salary;
 
    public Employee(int employeeId, String employeeName, double salary) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
 
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
       this.salary = salary;
    }
}

class Manager extends Employee{

   public static final double BONUSPERCENT=0.05;
   public Manager(int employeeId, String employeeName, double salary) {
       super(employeeId, employeeName, salary);
   }
   public double getSalary() {
       return salary+salary*BONUSPERCENT;
   }
}
class Developer extends Employee{ 
    public static final double BONUSPERCENT=0.02;
 
    public Developer(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);        
    }
 
    public double getSalary() {
 
        return salary+salary*BONUSPERCENT;
    }
}
 
public class Overriding_Example {
	public static void main(String[] args) {
        Developer d1=new Developer(1,"Pallavi" ,45000);
       
        Manager m1=new Manager(1,"Rohini" ,55000);
   
 System.out.println("Developer Salary: 45000");
        System.out.println("Name of Developer:" +d1.getEmployeeName()+" "+" \nUpdated Salary after incremented by 2%:" +d1.getSalary());
 System.out.println("Manager Salary: 55000");
        System.out.println("Name of Manager:" +m1.getEmployeeName()+" "+"\nUpdated Salary after incremented by 5%:" +m1.getSalary());
   
    
}
}
