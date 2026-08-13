/*
Problem 1: Student Result Management using Class and Object
Problem Statement:-
Create a Java program to manage the academic details of a student. Create a class Student with the
following data members:
rollNo
name
marks1
marks2
marks3
Create methods to
1. Accept student details.
2. Calculate total marks.
3. Calculate percentage.
4. Display the student's result.
5. Determine the grade using the following criteria:
Percentage        Grade
90 and above     A+
80-8                     A
70-79                   B
50-59                   D
Below 50             F
Create at least two Student objects and display their results.
*/
import java.io.*;
class Student{
int rollNo,java,math,dsa,sum,pers;
String name;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
void read()throws IOException{
System.out.print("Enter your Roll Nmber :");
rollNo=Integer.parseInt(br.readLine());
System.out.print("Enter Your Name :");
name=br.readLine();
System.out.print("Marks scored in JAVA out of 100 :");
java=Integer.parseInt(br.readLine());
System.out.print("Marks scored in DSA out of 100 :");
dsa=Integer.parseInt(br.readLine());
System.out.print("Marks scored in Maths out of 100 :");
math=Integer.parseInt(br.readLine());
sum=math+dsa+java;
pers=sum/3;
}
void result(){
System.out.println("Name :"+name);
System.out.println("Roll Number :"+rollNo);
System.out.println("Total Marks Obtained out of 300 :"+sum);
System.out.println("Persentage Scored :"+pers);
if(pers>=90){
System.out.println("Passed and Scored A+ Grade");
}
else if(pers>=80&&pers<=89){
System.out.print("Passed and Scored A");
}
else if(pers>=70&&pers<=79){
System.out.print("Passed and Scored B");
}
else if(pers>=60&&pers<=69){
System.out.print("Passed and Scored C");
}
else if(pers>=50&&pers<=59){
System.out.print("Passed and Scored D");
}
else{
System.out.print("Faild");
}
}
}
class Main{
public static void main(String arr[])throws IOException{
Student s1=new Student();
s1.read();
Student s2=new Student();
s2.read();
s1.result();
s2.result();
}
}