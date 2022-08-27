interface Area
{
public static float pi=3.14f;
public float compute (float x,float y);
}
class Rectangle implements Area
{
public float compute(float x,float y)
{
return(x+y);
}
}
class Circle implements Area
{
public float compute(float x,float y)
{
return(pi*x*y);
}
}
class InterfaceTest
{
public static void main(String arg[])
{
Rectangle rect=new Rectangle();
Circle cir=new Circle();
Area area=rect;
System.out.println("Area of Rectangle"+area. compute(10,20));
area=cir;
System.out.println("Area of Circle"+area.compute(10,12));
}
}