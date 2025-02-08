// Sheet 3 Q1

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Sheet3q1 {


    public static int countSquareFreeFactors(List<Integer> divisors){
        int squareFreeCount =0;

        for (int divisor : divisors) {
            if (divisor != 1 && !isNotSquareFree(divisor)) {
                squareFreeCount++;
            }
    }
        return squareFreeCount;
    }


    public static List<Integer> ListDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();

        for(int i =1 ;i*i<=n ; i++){
            if(n%i==0){
                divisors.add(i);

                if (i * i != n) {
                    divisors.add(n / i);
                }
            }

        }
        return divisors;
    }
    public static boolean isNotSquareFree(int n){
        for(int i =2; i*i<=n; i++){
            if (n%(i*i) ==0){

                return true;

            }

        }

        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        List<Integer> divisors = ListDivisors(n);


        int ans = countSquareFreeFactors(divisors);
        System.out.println(ans);

    }
}
