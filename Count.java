public class Count 
{ 
    public static void main(String[] args) { 
        String statement = "Modi Birthday @ September 17, #&$% is the wishes code for him."; 
        int count = 0; 
         
        for (int i = 0; i < statement.length(); i++) { 
            char ch = statement.charAt(i); 
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) { 
                count++; 
            } 
        } 
         
        System.out.println("Number of special characters: " + count); 
    } 
}