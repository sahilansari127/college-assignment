/*Problem 3: Number Analysis Tool
Problem Statement:-
Write a menu-driven Java program that accepts an integer and performs the following operations:
1. Check whether the number is Prime
2. Check whether it is Palindrome
3. Check whether it is Armstrong
4.Find the Sum of Digits
5.Reverse the Number
6.Exit
The program should continue until the user selects Exit.*/

import java.io.*;
import static java.lang.Math.*;
class Analysis
{
public static void main(String arr[])throws IOException
{
int ch;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.print("Enter an integer :");
int num=Integer.parseInt(br.readLine());
int z=num;
do{
System.out.println("Enter your choise:\n1.whether the number is prime\n2.whether the number is palindrome\n3.Check whether it is Armstrong\n4.Find the sum of the digite\n5.Reverse the Number\n6.Exit");
ch=Integer.parseInt(br.readLine());

switch(ch){
case 1:
int cnt=0;
num=z;
for(int i=1;i<=num;i++){
if(num%i==0){
 cnt++; }
}
if(cnt<=2){
System.out.println("its a prime number"); 
break; }
else{
System.out.println("Not a prime number");
break; }

case 2:
int c=0;
num=z;
while(num!=0){
int r=num%10;
c=(c*10)+r;
num=num/10;
}
if(z==c){
System.out.println("its a palindrome");
break; }
else{
System.out.println("not a palindrome");
break; }

case 3:
int j=0;
double m=0;
num=z;
while(num!=0){
num=num/10;
j++;}
num=z;
while(num!=0){
int l=num%10;
m=m+pow(l,j);
num=num/10;
}
if(m==z){
System.out.println("it is Armstrong number");
break;}
else{
System.out.println("not a Armstrong number"); 
break;}

case 4:
int p=0;
num=z;
while(num!=0){
int r=num%10;
p=p+r;
num=num/10;}
System.out.println("there sum is "+p);
break;

case 5:
int x=0;
num=z;
while(num!=0){
int r=num%10;
x=(x*10)+r;
num=num/10;
}
System.out.println("their reverse is "+x);
break;
}
}
while(ch!=6);
}
}
