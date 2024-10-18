import java.util.Scanner;
public class reverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter some digits");
        int n = sc.nextInt();
        int ans =0;
        while(n>0){
            ans = ans*10+n%10;
            n/=10;                    // remove last digit

        }
        System.out.println("reverse order is "+ans);
    }
}
