class PalindromeCheck{
    static boolean check(int[] array){
       int l= 0;
       int r= array.length-1;
        
        while(l<=r){
            if(array[l]!= array[r]){
                 System.out.println("array is not palindrome");
                 return false;
            }
             l++;
             r--;
        }
        System.out.println("array is palindrome");
        return true;
    }
    public static void main(String[] args){
        int[] array = {44,56,56,44};
        check(array);
    }
}
