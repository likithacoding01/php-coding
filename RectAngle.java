import java.lang.*;
class RectArea
{
int length;
int width;
public void getData(int a,int b)
{
length=a;
width=b;
}
public int rectArea()
{
int area=length*width;
return area;
}
}
class RectAngle
{
public static void main(String arr[])
{
int area1,area2;
RectArea rect1=new RectArea();
RectArea rect2=new RectArea();
rect1.length=10;
rect1.width=20;
area1=rect1.length*rect1.width;
rect2.getData(10,30);
area2=rect2.rectArea();
System.out.println("area 1="+area1);
System.out.println("area 2="+area2);
}
}