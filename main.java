import java.util.Scanner;
class main
{
int x;
int y;
int c;
main(int x,int y)
{
c=x+y;
}
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("enter the number :");
int a = obj.nextInt();
System.out.println("enter the number :");
int b = obj.nextInt();
main myobj = new main(a,b);
System.out.println(myobj.c);
}
}