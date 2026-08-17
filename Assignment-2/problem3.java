/*
Problem 3: : Shape Shape Calculator using Abstract Class Problem Statement
Create an abstract class Shape containing:
abstract void calculateArea():
abstract void calculatePerimeter();
Create the following subclasses:
Circle
Rectangle
Triangle
Each subclass should implement the abstract methods according to its shape.
For example
1.Circle
Area=3.14 x r x r
Perimeter =2 x 3.14 x r
2.Rectangle
Area = length x breadth
Perimeter =2 × (length + breadth)
3.Triangle
Area = ½ x base x height
Perimeter = sidel + side2+ side3
Create objects of each subclass and display their area and perimeter.
*/import java.io.*;
abstract class Shape{
double area,Perimeter;
abstract void calculateArea();
abstract void calculatePerimeter();
}
class Rectangle extends Shape{
double length,breadth;
Rectangle(double x,double y ){
length=x;
breadth=y;
}
void calculateArea(){
area=length*breadth;
System.out.println("Area of Rectangle is :"+area);
}
void calculatePerimeter(){
Perimeter=2*(length+breadth);
System.out.println("Perimeter of Rectangle is :"+Perimeter);
}
}
class Circle extends Shape{
double radius,pi=3.14;
Circle(double x){
radius=x;
}
void calculateArea(){
area=pi*radius*radius;
System.out.println("Area of Circle is :"+area);
}
void calculatePerimeter(){
Perimeter=2*pi*radius;
System.out.println("Perimeter of Circle is :"+Perimeter);
}
}
class Triangle extends Shape{
double base,height,side1,side2,side3;
Triangle(double x,double y,double s1,double s2,double s3){
base=x;
height=y;
side1=s1;
side2=s2;
side3=s3;
}
void calculateArea(){
area=0.5*base*height;
System.out.println("Area of Triangle is :"+area);
}
void calculatePerimeter(){
Perimeter=side1+side2+side3;
System.out.println("Perimeter of Triangle is :"+Perimeter);
}
}
class Main{
public static void main(String arr[])throws IOException
{
Shape s[]=new Shape[3];
for(int i=0;i<3;i++){
if(i==0){
s[i]=new Rectangle(5,20); // pass in format (length,breadth)
s[i].calculateArea();
s[i].calculatePerimeter();
}
if(i==1){
s[i]=new Circle(8);    //pass in format (radius)
s[i].calculateArea();
s[i].calculatePerimeter();
}
if(i==2){
s[i]=new Triangle(5,6,8,9,3);   //pass in format (base,height,side1,side2,side3)
s[i].calculateArea();
s[i].calculatePerimeter();
}
}
}
}


