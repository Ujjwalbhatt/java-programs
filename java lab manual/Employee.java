import java.util.Scanner;
class Employee
{
    int id;
    String name,department;
    double salary;
    void setDetails(int id,String name,String department,double salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    void showDetails()
    {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+salary);
    }
    public static void main(String args[])
    {
        Employee e1=new Employee();
        Scanner sc=new Scanner(System.in);
        int id;
        String name,dept;
        double salary;
        System.out.print("Enter id: ");
        id=sc.nextInt();
        System.out.print("Enter name: ");
        name=sc.next();
        System.out.print("Enter department: ");
        dept=sc.next();
        System.out.print("Enter Salary: ");
        salary=sc.nextDouble();
        
        e1.setDetails(id,name,dept,salary);
        e1.showDetails();
    }
}
