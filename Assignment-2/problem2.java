/*Problem 2: Bank Account using Constructors
Problem Statement :-
Develop a Java program to create a simple bank account system. Create a class Bank Account
containing:
accountNumber
accountHolderName
balance
Implement the following:
1. Create a default constructor that initializes the account with default values.
2. Create a parameterized constructor to initialize account details.
3. Create a method deposit() to deposit money.
4. Create a method withdraw() to withdraw money.
5. Create a method displayAccount() to display account details
6. Do not allow withdrawal if the requested amount is greater than the available balance. 
Create at least two objects using different constructors.
*/
import java.io.*;
class BankAccount{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int accountNumber,balance,upbal,depo,wdra;
String name;
BankAccount(){
accountNumber=0;
name="NULL";
balance=0;
}
BankAccount(int x,String y,int z){
accountNumber=x;
name=y;
balance=z;
}
void deposit() throws IOException{
System.out.print("Enter amount to be deposit :");
depo=Integer.parseInt(br.readLine());
upbal=balance+depo;
}
void withdraw() throws IOException{
System.out.print("Enter amount to be withdraw :");
wdra=Integer.parseInt(br.readLine());
if(wdra>upbal){
wdra=0;
System.out.println("Insufficient Balance!!");
}
else{
upbal=upbal-wdra;
}
}
void displayAccount(){
System.out.println("Account Number :"+accountNumber);
System.out.println("Account Name :"+name);
System.out.println("Balance :"+balance);

System.out.println("Deposit :"+depo);
System.out.println("Withdraw :"+wdra);

System.out.println("Updated Balance :"+upbal);
}
}
class Main{
public static void main(String art[]) throws IOException{
BankAccount b1=new BankAccount();
b1.displayAccount();
BankAccount b2=new BankAccount(1321 ,"Sahil", 25);
b2.deposit();
b2.withdraw();
b2.displayAccount();
BankAccount b3=new BankAccount(1322 ,"Dhanya", 250);
b3.deposit();
b3.withdraw();
b3.displayAccount();
}
}
