import java.util.Scanner;
public class Gcd
{
public static int gcd(int a,int b)
{
if(a==0)
return b;
else
return gcd(a%b,a);
}
public static void main(String args[])
{

Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int result=gcd(a,b);
System.out.println("gcd of "+a+","+b+" is"+result);
}
}
