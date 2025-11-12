//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
 public static void main(String[] args) 
 {
        
        String wordString = args[0];          
        int cheerCount = Integer.parseInt(args[1]);  

        String specialLetters = "AEFHILMNORSX"; 

        for (int i = 0; i < wordString.length(); i++) 
        {
            char ch = wordString.charAt(i); 

            String connector; 
            if (specialLetters.indexOf(ch) != -1)
            {  
                connector = "an ";  
            }
             else 
            {
                connector = "a  ";  
            }

            
            System.out.println("Give me " + connector + ch + ":");
        }

        System.out.println("What does that spell?");

        for (int i = 0; i < cheerCount; i++) 
        {
            System.out.println(wordString + "!!!");
        }
    
}
}        

