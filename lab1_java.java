import java.lang.Math;
import java.util.Scanner;
class Quad
{
public static void main(String arr[])
{
Scanner s=new Scanner(System.in);

System.out.println("Enter the coefficients a,b,c");

double a=s.nextInt();
double b=s.nextInt();
double c=s.nextInt();
double r1,r2,d;
  d=b*b-4*a*c;
double res=Math.sqrt(d);
if(a==0){System.out.println("Invalid input for a");}
else{
if(d>0)
{
System.out.println("The roots are real and distinct");
r1=(-b+Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("The roots are:"+r1+"   "+r2);
}
else if(d==0)
{
r1=r2=(-b)/(2*a);
System.out.println("The roots are real and equal");
System.out.println("Roots are r1=r2="+r1);
}
else
{
r1=-b/(2*a);
r2=(Math.sqrt(Math.abs(d)))/(2*a);
System.out.println("The roots have no real solution and are imaginary");
System.out.println(r1+"+i"+r2+"\n"+r2+"-i"+r2);
}}
}
}
