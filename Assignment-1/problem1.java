problem 1:student marks calculater
import java.io.*;
class Evaluate{
public static void main(String arr[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.print("Marks scored in Maths out of 100 :");
int maths=Integer.parseInt(br.readLine());
System.out.print("Marks scored in DSA out of 100 :");
int dsa=Integer.parseInt(br.readLine());
System.out.print("Marks scored in JAVA out of 100 :");
int java=Integer.parseInt(br.readLine());
System.out.print("Marks scored in Urdu out of 100 :");
int urdu=Integer.parseInt(br.readLine());
System.out.print("Marks scored in ENG out of 100 :");
int eng=Integer.parseInt(br.readLine());
int sum=maths+dsa+java+urdu+eng;
System.out.println("Total marks obtained:"+sum);
int pers=sum/5;
System.out.println("percentage obtained :"+pers+"%");
if(pers>=90){
System.out.print("Passed and Scored A+");
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