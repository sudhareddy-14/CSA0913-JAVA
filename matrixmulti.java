import java.util.Scanner; 
class MatrixMultiplication 
{ 
public static void main(String args[])  
{ 
Scanner scanner = new Scanner(System.in); 
System.out.println("Enter elements for matrix A(2x2):"); 
int[][] a=new int[2][2]; 
for (int i=0;i<2;i++) 
{ 
} 
for (int j=0;j<2;j++) 
{ 
} 
a[i][j]=scanner.nextInt(); 
System.out.println("Enter elements for matrix B(2x2):"); 
int[][] b=new int[2][2]; 
for (int i=0;i<2;i++) 
{ 
for (int j=0;j<2;j++) 
{ 
b[i][j]=scanner.nextInt(); 
} 
} 
int[][] c=new int[2][2]; 
for (int i=0;i<2;i++) 
{ 
} 
for (int j=0;j<2;j++) 
{ 
} 
c[i][j]=0; 
for (int k=0;k<2;k++) 
{ 
} 
c[i][j]+=a[i][k]*b[k][j]; 
System.out.print(c[i][j]+" "); 
System.out.println(); 
scanner.close(); 
} 
} 
