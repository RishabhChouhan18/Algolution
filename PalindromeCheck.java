import java.util.Scanner;
class CheckPalindrome {
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
            Scanner sc = new Scanner(System.in);
            int[] array  = new int[5];
            for(int i =0 ;i<array.length ; i++){
                array[i] = sc.nextInt();
            }
            check(array);
        }
    }

