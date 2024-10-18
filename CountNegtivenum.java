import java.util.Scanner;
public class CountNegtivenum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a size of an array :");
        int r = sc.nextInt();

        int arr[] = new int[r];
        System.out.println("enter elements in array :");
        for(int i = 0; i< r; i++ ) {
            arr[i] = sc.nextInt();
        }
         int negetiveCount =0;

        for(int i =0; i<r; i++){
            if(arr[i]<0){
                negetiveCount++;
            }
        }
        int ans = negetiveCount;
        System.out.println("total negetive number is :" +ans);
    }

}
