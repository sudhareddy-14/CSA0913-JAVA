class conversion 
{
public static void main(String args[])
{
String s = new String("Saveetha University");
String str1 = "hello";
String str2 = "hi";
System.out.println("String length is: " + s.length());
System.out.println("Index of 'v' is: " + s.indexOf('v'));
System.out.println("Substring from index 2 is: " + s.substring(2));
System.out.println("Character at index 2 is: " + s.charAt(2));
System.out.println("String after replace 'e' with 'g': " + s.replace('e','g'));
System.out.println("String in uppercase is: " + s.toUpperCase());
System.out.println("String in lowercase is: " + s.toLowerCase());
System.out.println("str1.equals(str2) is " + str1.equals(str2));
System.out.println("Comparison of str2 and str1 is " + str2.compareTo(str1));
int n=45;
String strNumber=String.valueOf(n);
String str3=strNumber+str1;
System.out.println("the value is:"+str3);
}
}