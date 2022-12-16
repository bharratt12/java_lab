import java.util.Scanner;
class Student
{
String name,usn;
int marks[]=new int[5];
int credits[]=new int[5];
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("enter your name:");
name=s.nextLine();
System.out.println("enter your usn:");
usn=s.next();
System.out.println("enter the marks of each subject");
for(int i=0;i<5;i++)
{
marks[i]=s.nextInt();
}
System.out.println("enter the no of credits for each subject");
for(int j=0;j<5;j++)
credits[j]=s.nextInt();
}
void display()
{
System.out.println("name:"+name);
System.out.println("usn:"+usn);
for(int i=0;i<5;i++)
{
System.out.println("marks of subject"+(i+1)+"="+marks[i]);
System.out.println("no of credits for the subj above="+credits[i]);
}
}
void calc()
{
int gr_point[]=new int[5];
int sgpa=0;
int sum=0;
float res;
for(int i=0;i<5;i++)
{
if(marks[i]>=90)
gr_point[i]=10;
else if(marks[i]>=80)
gr_point[i]=9;

else if(marks[i]>=70)
gr_point[i]=8;

else if(marks[i]>=60)
gr_point[i]=7;

else if(marks[i]>=50)
gr_point[i]=6;

else if(marks[i]>=40)
gr_point[i]=5;

else if(marks[i]<35 && marks[i]>0)
gr_point[i]=0;
else
System.out.println("Invalid input for"+(i+1)+"subject");
sgpa+=(gr_point[i]*credits[i]);
sum+=(credits[i]);
}
res=(float)sgpa/sum;
System.out.println("sgpa="+res);
}
}
class Sgpa
{
public static void main(String arr[])
{
Student s1=new Student();
s1.input();
s1.display();
s1.calc();
}
} 
