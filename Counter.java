import java.util.*; 
class Counter 
{ 
 public static void main(String args[]) 
 { 
  Scanner sc=new Scanner(System.in); 
  int lowercase=0; 
  int uppercase=0; 
  int numbercount=0; 
 
  System.out.println("Enter * to exit..."); 
        char input; 
 
        do { 
            System.out.print("Enter any character: "); 
            input = sc.next().charAt(0); 
 
            if (Character.isUpperCase(input)) { 
                uppercase++; 
            } else if (Character.isLowerCase(input)) { 
                lowercase++; 
            } else if (Character.isDigit(input)) { 
                numbercount++; 
            } 
 
        } while (input != '*'); 
  System.out.println("Total count of lower case:"+lowercase); 
  System.out.println("Total count of upper case:"+uppercase); 
  System.out.println("Total count of Digit:"+numbercount); 
 } 
}