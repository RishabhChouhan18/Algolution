
public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        String cleaned = "";

        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
          
            if (Character.isLetterOrDigit(c)) {
                cleaned += Character.toLowerCase(c); 
            }
        }

     
        String reversed = ""; 
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i); 
        }

        
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
      
        System.out.println(isPalindrome(input1)); 
       
    }
}
