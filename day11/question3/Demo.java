package day11.question3;

import java.util.Optional;
import java.util.Scanner;
public class Demo
{
public static void main( String[] arg)
{
Scanner sc= new Scanner(System.in);
String[] info = new String[5];
info[0]="John";
info[2]=new Integer(26).toString();
Optional<String> isNullfname = Optional.ofNullable(info[0]);
Optional<String> isNulllname = Optional.ofNullable(info[1]);
Optional<String> isNullage = Optional.ofNullable(info[2]);
for(int i=0; i<2;i++)
{
if(isNulllname.isPresent())
{
info[3]=info[0].substring(0)+" "+info[1].substring(0);
// display full infor
System.out.println("All present values are :");
System.out.println("fname : "+info[0]);
System.out.println("lname : "+info[1]);
System.out.println("Age : "+info[2]);
System.out.println("fullname: "+info[3]);
break;
}else
{
System.out.println("Last name is not present");
}
System.out.println("Enter last name");
info[1]=sc.next();
isNulllname = Optional.ofNullable(info[1]);
}
}
}
