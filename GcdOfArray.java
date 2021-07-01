import java.util.Scanner;
public class GcdOfArray
{
public static void printArray(int a[])
{
for(int val:a)
System.out.print(val+" ");
}
public static int gcd(int a,int b)
{
if(a==0)
return b;
else return gcd(b%a,a);
}
public static int findGcd(int a[])
{
int res=a[0];
for(int i=0;i<a.length;i++)
{
res=gcd(res,a[i]);
if(res==1) return 1;
}

return res;
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=scan.nextInt();
int res=findGcd(a);
printArray(a);
System.out.println("gcd of arr is"+res);
}
}
