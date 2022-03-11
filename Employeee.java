
package employeee;

import java.util.Scanner;

public class Employeee {
 public int id;
 public String name;
    public static void main(String[] args) {
        Salaryemp emp= new Employee();
        emp.calculatepayroll();
    }
    
}
public interface ipayroll
{
    public int id;
    public String name;
    public void calculatepayroll()
    {
       Scanner input = new Scanner(System.in);
 
      System.out.println("Enter employee's name:");
      String employee = input.next();
 
      System.out.println("Enter number of hours worked:");
      double  hours = input.nextDouble();
 
      System.out.println("Enter hourly pay rate:");
      double  pay = input.nextDouble();
 
      double  gross_pay = pay * hours; 
    }
    
}
public class Salaryemp extends Employee implements ipayroll
{
   
    public void calculatepayroll()
    {
       Scanner input = new Scanner(System.in);
 
      System.out.println("Enter employee's name:");
      String employee = input.next();
 
      System.out.println("Enter number of hours worked:");
      double  hours = input.nextDouble();
 
      System.out.println("Enter hourly pay rate:");
      double  pay = input.nextDouble();
 
      double  gross_pay = pay * hours; 
    }
}
public class Hrlyemp extends Employee implements ipayroll
{
   
    public void calculatepayroll()
    {
       Scanner input = new Scanner(System.in);
 
      System.out.println("Enter employee's name:");
      String employee = input.next();
 
      System.out.println("Enter number of hours worked:");
      double  hours = input.nextDouble();
 
      System.out.println("Enter hourly pay rate:");
      double  pay = input.nextDouble();
 
      double  gross_pay = pay * hours; 
    }
}
