import java.util.Scanner;
public class ArrayRotationSecondApproach
{
public static void printArray(int a[])
{
for(int value:a)
System.out.print(value+" ");
}
public static void rotateArray(int a[],int r)
{
while(r>0)
{
int temp=a[0];
for(int i=1;i<a.length;i++)
a[i-1]=a[i];
a[(a.length)-1]=temp;
r--;
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
