/*
Problem 5: Payment System using Interface
Problem Statement
Design a Java application for processing different types of payments. Create an interface Payment
containing:
void makePayment(double amount);
void paymentDetails();
Create the following classes implementing the interface: 
1. CreditCardPayment
2. UPIPayment
3. CashPayment
->CreditCardPayment
Store:
Card Number
Card Holder Name
Display the payment details and amount. 
->UPIPayment
Store
UPI ID
User Name
Display the payment details and amount.
->CashPayment
Store:
Customer Name
Display the payment details and amount.
The program should allow the user to select a payment method and process the payment.
*/
import java.io.*;
interface Payment{
void makePayment(double amount);
void paymentDetails();
}
class CreditCardPayment implements Payment{
int cardNumber;
String holderName;
CreditCardPayment(int x,String y,double z){
cardNumber=x;
holderName=y;
makePayment(z);
}
public void makePayment(double amount){
System.out.println("Payment Successful !!");
paymentDetails();
System.out.println("Amount :"+amount);
}
public void paymentDetails(){
System.out.println("Card Number :"+cardNumber);
System.out.println("Card Holder Name :"+holderName);
}
}
class UPIPayment implements Payment{
String UPIid,name;
UPIPayment(String x,String y,double z){
UPIid=x;
name=y;
makePayment(z);
}
public void makePayment(double amount){
System.out.println("Payment Successful !!");
paymentDetails();
System.out.println("Amount :"+amount);
}
public void paymentDetails(){
System.out.println("UPI id :"+UPIid);
System.out.println("User Name :"+name);
}
}
class CashPayment implements Payment{
String name;
CashPayment(String x,double z){
name=x;
makePayment(z);
}
public void makePayment(double amount){
System.out.println("Payment Successful !!");
paymentDetails();
System.out.println("Amount :"+amount);
}
public void paymentDetails(){
System.out.println("User Name :"+name);
}
}
class Main{
public static void main(String arr[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
CreditCardPayment c;
UPIPayment u;
CashPayment p;
System.out.println("---------PAYMENT SYSTEM-----------");
System.out.println("1.Credit Card \n2.UPI \n3.Cash");
System.out.print("Enetr your choise :");
int ch=Integer.parseInt(br.readLine());
switch(ch){
case 1:
System.out.print("Enter Card Number :");
int a=Integer.parseInt(br.readLine());
System.out.print("Enetr Amount :");
int b=Integer.parseInt(br.readLine());
c=new CreditCardPayment(a,"sahil",b);
break;
case 2:
System.out.print("Enter UPI ID :");
String n=br.readLine();
System.out.print("Enetr Amount :");
a=Integer.parseInt(br.readLine());
u=new UPIPayment(n,"sahil",a);
break;
case 3:
System.out.print("Enter Your Name :");
n=br.readLine();
System.out.print("Enetr Amount :");
b=Integer.parseInt(br.readLine());
p=new CashPayment(n,b);
break;
}
}
}

