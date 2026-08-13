/*Problem 4: Array statistics
Write a Java program to read 10 integers into an array and perform the following operations: 
 Find Maximum Element 
 Find Minimum Element 
 Calculate Average 
 Count Even Numbers 
 Count Odd Numbers 
 Search for a given number 
 Display the array in reverse order
*/
import java.io.*;
class Main{
public static void main(String arr[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
System.out.println("Enter 10 Element Of Array: ");
int s[]=new int[10];
for(int i=0;i<10;i++){
System.out.print("Enter Element "+(i+1)+":");
s[i]=Integer.parseInt(br.readLine());
}
int temp;
for(int i=0;i<10;i++){
for(int j=0;j<10;j++){
if(s[i]<=s[j]){
temp=s[j];
s[j]=s[i];
s[i]=temp;
}
}
}
System.out.println("Maximum Element is :"+s[9]);
System.out.println("Minimum Element is :"+s[0]);
int evencnt=0,oddcnt=0,sum=0,a=0;
double avg;
System.out.println("Enter The Number Want To Search");
int k=Integer.parseInt(br.readLine());
for(int i=0;i<10;i++){
sum+=s[i];
if(s[i]%2==0){
evencnt++;
}
else{
oddcnt++;
}
if(s[i]==k){
a++;
}
}
avg=sum/10;
System.out.println("There Average is :"+avg);
System.out.println("Even count :"+evencnt);
System.out.println("Odd count :"+oddcnt);
if(a>0){
System.out.println("Number Found In Array");
}
else{
System.out.println("Number Not Found In Array");
}
System.out.println("Reverse of array is :");
for(int i=9;i>=0;i--){
System.out.print(s[i]+" ");
}
}
}
