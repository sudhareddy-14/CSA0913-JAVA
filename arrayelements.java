import java.util.Scanner; 
 class CompositeNumbers { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter the size of the array: "); 
int size = scanner.nextInt(); 
int[] array = new int[size]; 
System.out.println("Enter the array elements:"); 
for (int i = 0; i < size; i++) { 
array[i] = scanner.nextInt(); 
} 
int compositeCount = 0; 
for (int i = 0; i < size; i++) { 
if (isComposite(array[i])) { 
compositeCount++; 
} 
} 
System.out.println("Number of composite numbers in the array " + compositeCount); 
} 
public static boolean isComposite(int num) { 
if (num <= 1) { 
return false; 
} 
for (int i = 2; i <= Math.sqrt(num); i++) { 
if (num % i == 0) { 
return true; 
} 
} 
return false; 
} 
} 
