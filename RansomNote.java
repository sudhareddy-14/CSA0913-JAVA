public class RansomNote  
{ 
public static void main(String[] args)  
{ 
Scanner input = new Scanner(System.in); 
System.out.print("Ransom Note: "); 
String ransomNote = input.next(); 
System.out.print("Magazine: "); 
String magazine = input.next(); 
if(ransomNote.length() > magazine.length()) 
{ 
System.out.println("false"); 
return; 
} 
int[] magazineCount = new int[26]; 
for(char c : magazine.toCharArray()) 
{ 
magazineCount[c - 'a']++; 
} 
for(char c : ransomNote.toCharArray())  
{ 
magazineCount[c - 'a']--; 
if (magazineCount[c - 'a'] < 0) { 
System.out.println("false"); 
return; 
} 
} 
System.out.println("true"); 
} 
} 