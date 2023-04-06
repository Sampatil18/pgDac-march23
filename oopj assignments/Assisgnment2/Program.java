import java.util.Scanner;

class Employee{
  private String name;
  private int empid;
  private float salary;
  public Employee( ){
    //TODO
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getEmpid() {
    return this.empid;
  }
  public void setEmpid(int empid) {
    this.empid = empid;
  }
  public float getSalary() {
    return this.salary;
  }
  public void setSalary(float salary) {
    this.salary = salary;
  }
}
class EmployeeTest{
  private Employee emp = new Employee();
  public void acceptRecord( ){
    Scanner sc = new Scanner(System.in);
    System.out.print("Name  : ");
    emp.setName( sc.nextLine() );

    System.out.print("Empid : ");
    emp.setEmpid( sc.nextInt() );

    System.out.print("Salary  : ");
    emp.setSalary( sc.nextFloat() );
  }
  public void printRecord( ){
    System.out.println( emp.getName()+"  "+emp.getEmpid()+" "+emp.getSalary());
  }
}
public class Program {
  public static void main(String[] args) {
    EmployeeTest test = new EmployeeTest();
    test.acceptRecord();
    test.printRecord();
  }
}