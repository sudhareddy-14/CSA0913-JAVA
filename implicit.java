class implicit{
public static void main(String args[]) {
int a=10;
long b=a;
float c=b;
double d=c;
System.out.println("int="+a);
System.out.println("long="+b);
System.out.println("float="+c);
System.out.println("double="+d);
double e=d;
float f=(float)e;
long g=(long)f;
int h=(int)g;
System.out.println("double="+e);
System.out.println("float="+f);
System.out.println("long="+g);
System.out.println("int="+h);

int x=Integer.MAX_VALUE;
byte i=Byte.MAX_VALUE;
System.out.println("Integer Value = "+x);
System.out.println("Byte Value = "+i);
if(x<i)
{
System.out.println("overflow");
}else
{
System.out.println("underflow");
}
}
}