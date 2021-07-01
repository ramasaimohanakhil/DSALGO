import java.util.Scanner;
public class JugglingArrayRotation
{
public static void printArray(int a[])
{
for(int val:a)
System.out.print(val+" ");
System.out.println();
}
public static int hcf(int a,int b)
{
if(a==0)
return b;
else
return hcf(b%a,a);
}
public static void rotateArray(int a[],int r)
{
int n=a.length;
int step=hcf(n,r);
System.out.println("hcf= "+step);
for(int i=0;i<step;i++)
{
int temp=a[i];
int j=i;
r=r%n;
while(true)
{
int k=j+r;
if(k>=n)
k=k-n;
if(k==i)
break;
a[j]=a[k];
j=k;
printArray(a);
}
a[j]=temp;
printArray(a);
}
printArray(a);
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
 a[i]=scan.nextInt();
printArray(a);
int r=scan.nextInt();
rotateArray(a,r);
}
}
