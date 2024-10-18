//public class PalindromeChecker {
//    public static void main(String[] args) {
//        String s1 = "A man, a plan, a canal: Panama";
//        String s2 = "race a car";
//
//        System.out.println("Is the first string a palindrome? " + isPalindrome(s1));
//        System.out.println("Is the second string a palindrome? " + isPalindrome(s2));
//    }
//
//    public static boolean isPalindrome(String s) {
//        StringBuilder cleanedString = new StringBuilder();
//
//        // String ko process karte hain
//        for (char c : s.toCharArray()) {
//            // Agar character alphanumeric hai to usse lowercase me convert karke cleanedString me daalte hain
//            if (Character.isLetterOrDigit(c)) {
//                cleanedString.append(Character.toLowerCase(c));
//            }
//        }
//
//        // Cleaned string ko reverse karte hain
//        String reversedString = cleanedString.reverse().toString();
//
//        // Check karte hain agar cleaned string original cleaned string ke barabar hai
//        return cleanedString.toString().equals(reversedString);
//    }
//}
public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        String cleaned = ""; // Cleaned string ko store karne ke liye

        // Har character ko check karna
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Agar character letter ya digit hai, toh cleaned string mein add karo
            if (Character.isLetterOrDigit(c)) {
                cleaned += Character.toLowerCase(c); // Lowercase mein convert karo
            }
        }

        // Cleaned string ko reverse karna
        String reversed = ""; // Reversed string ko store karne ke liye
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i); // Reverse order mein characters ko add karo
        }

        // Check karna ki cleaned string aur reversed string same hain ya nahi
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
       // String input2 = "race a car";

        System.out.println(isPalindrome(input1)); // Output: true
       // System.out.println(isPalindrome(input2)); // Output: false
    }
}