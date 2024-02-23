public class LastWordLength 
 { 
    public static void main(String[] args)  
{ 
        String s = "Java programming"; 
        int lengthOfLastWord = findLengthOfLastWord(s); 
 
        System.out.println("The length of the last word is: " + lengthOfLastWord); 
    } 
 
    public static int findLengthOfLastWord(String s)  
{ 
        s = s.trim(); 
 
 
        int lastSpaceIndex = s.lastIndexOf(' '); 
 
 
        String lastWord = s.substring(lastSpaceIndex + 1); 
        return lastWord.length(); 
    } 
} 