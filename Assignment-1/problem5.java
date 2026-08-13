/*
Problem 5: Employee Salary Management System
Problem Statement:-
Write a Java program that accepts details of N employees (using arrays): 
Employee ID
Employee Name
Basic Salary
Calculate:
DA = 40% of Basic Salary
HRA = 20% of Basic Salary
PF = 12% of Basic Salary
Gross Salary = Basic + DA + HRA
Net Salary = Gross Salary - PF
Display all employee details in a tabular format and also display:
Highest Paid Employee
Lowest Paid Employee
Average Salary of all employees
*/
import java.io.*;
class Employee{
int empid,bsal=0;
double DA,PF,HRA,Gsal,Nsal;
String name;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void read()throws IOException {
System.out.print("Enter Your Emlpoyee Id :");
empid=Integer.parseInt(br.readLine());
System.out.print("Enter Your Name :");
name=br.readLine();
System.out.print("Enter your base salary :" );
bsal=Integer.parseInt(br.readLine());
DA=bsal*0.04;    //bsal=Base salary
PF=bsal*0.12;
HRA=bsal*0.2;
Gsal=bsal+DA+HRA;   //Gsal=Gross Salary
Nsal=Gsal-PF;   // Net Salary
}
void show(){
System.out.println(empid+"\t"+name+"\t"+bsal+"\t\t"+DA+"\t"+PF+"\t"+HRA+"\t"+Gsal+"\t"+Nsal);
}
}
class Main{
public static void main(String arr[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Nmber of records? :");
int n=Integer.parseInt(br.readLine());
Employee e[]=new Employee[n];
for(int i=0;i<n;i++){
e[i]=new Employee();
e[i].read();
}
System.out.println("\n");
System.out.println("Id\tName\tBase Salary\tDA\tPF\tHRA\tGs\tNs" );
for(int i=0;i<n;i++){
e[i].show();
}
if(n==1){
System.out.println("\nSince Only one Employee Highest,Lowest and Average Salary is equal to Base Salary:");	
}
else{ 
double maxS=e[1].bsal,avg=0;
double minS=e[1].bsal;
int maxI=1,minI=1;
for(int i=0;i<n;i++){
if(e[i].bsal>maxS){
maxS=e[i].bsal;
maxI=i;
}
avg=avg+e[i].bsal;
if(e[i].bsal<minS){
minS=e[i].bsal;
minI=i;
}
}
avg=avg/n;
System.out.println("Highest  paid Employee :");
System.out.println("Id\tName\tBase Salary");
System.out.println(e[maxI].empid+"\t"+e[maxI].name+"\t"+e[maxI].bsal);
System.out.println("Lowest paid Employee :");
System.out.println("Id\tName\tBase Salary");
System.out.println(e[minI].empid+"\t"+e[minI].name+"\t"+e[minI].bsal);
System.out.println("Average Salary of all Employees is :"+avg);
}
}
}
