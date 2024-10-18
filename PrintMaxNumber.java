import java.util.Scanner;
public class PrintMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max =0;
        int arr[] = new int[5];
        System.out.println("enter numbers in array :");
        for(int i = 0; i< 5; i++ ) {
            int num = sc.nextInt();

            if(num>max){
                max =num;
            }

            }
        System.out.println("The maximum number is : "+max);
        }
        }



