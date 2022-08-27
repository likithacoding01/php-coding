class EvenNos extends Thread
{
int n;
EvenNos(int x)
{
n=x;
}
public void run()
{
for (int i=2;i<=n;i+=2)
{
System.out.println("even number is :"+i);
}
}
}
class OddNos extends Thread
{
int n;
OddNos(int x)
{
n=x;
}
public void run()
{
for (int i=1;i<=n;i+=2)
{
System.out.println("odd numbers is:"+i);
}
}
}
class ThreadDemo
{
public static void main(String arr[])
{
EvenNos e=new EvenNos(15);
OddNos o=new OddNos(15);
e.start();
o.start();
}
}