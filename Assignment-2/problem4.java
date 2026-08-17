/*
Problem 4: Employee Salary System using Abstract Class
Problem Statement
Develop a Java program for calculating the salary of different types of employees. Create an abstract
class Employee containing:
employeeld
employeeName
basicSalary
and the following abstract method: abstract double calculateSalary():
Create two subclasses
PermanentEmployee
Salary calculation:
HRA = 20% of Basic Salary
DA =40% of Basic Salary
PF = 12% of Basic Salary
Gross Salarv = Basic + HRA + DA Net Salary Gross Salary - PF
2. ContractEmployee
Salary calculation:
Gross Salary Basic Salary + 10% Allowance
The program should:
1. Accept employee details.
2.Calculate salary according to employee type.
3.Display employee information and calculated salary
*/
import java.io.*;
abstract class Employee{
int employeeId,basicSalary;
String employeeName;
abstract double calculateSalary();
}
class PermanentEmployee extends Employee{
double DA,PF,HRA,Gsal,Nsal;
PermanentEmployee(int x,String y,int z){
employeeId=x;
employeeName=y;
basicSalary=z;
}
void display(){
System.out.println("Employee Id is :"+employeeId);
System.out.println("Employee Name is :"+employeeName);
System.out.println("Employee Basic Salary is :"+basicSalary);
System.out.println("Employee Gross Salary is :"+Gsal);
//System.out.println("Employee Net Salary is :"+Gsal);
}
double calculateSalary(){
DA=basicSalary*0.4;
PF=basicSalary*0.12;
HRA=basicSalary*0.2;
Gsal=basicSalary+DA+HRA;
Nsal=Gsal-PF;   // Net Salary
display();
return Nsal;
}
}
class ContractEmployee extends Employee{
double Gsal,basicSalary;
ContractEmployee(int x,String y,int z){
employeeId=x;
employeeName=y;
basicSalary=z;
}
void display(){
System.out.println("Employee Id is :"+employeeId);
System.out.println("Employee Name is :"+employeeName);
System.out.println("Employee Basic Salary is :"+basicSalary);
}
double calculateSalary(){
Gsal=basicSalary+(basicSalary*0.1);
display();
return Gsal;
}
}
class Main{
public static void main(String arr[]){
PermanentEmployee e1=new PermanentEmployee(101,"sahil",20000);
System.out.println("Employee Net Salary is :"+e1.calculateSalary());
ContractEmployee e2=new ContractEmployee(102,"arin",20000);
System.out.println("Employee Gross Salary is :"+e2.calculateSalary());

}
}