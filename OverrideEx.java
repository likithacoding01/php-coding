
class A
{
void display()
{ 
System.out.println("this is A class method");
}
}
class B extends A
{
void display()
{
System.out.println("this is B class method");
}
}
class OverrideEx
{
public static void main(String arg[])
{
B b=new B();
b.display();
}
}