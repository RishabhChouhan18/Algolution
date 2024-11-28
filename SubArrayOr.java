// set-3 Quetion no. 2
import java.util.ArrayList;
import java.util.List;
public class SubArrayOr {
    static List<Integer> ans = new ArrayList<>();

    static void check(List<Integer> v) {
        int a=0;
        for(int i =0; i<v.size(); i++){
            a=a| v.get(i);
        }
        ans.add(a);
    }

    public static void main(String[] args) {
        List<Integer> v = List.of(10,100,1000);
        int result =0;
        for(int i =0; i<v.size(); i++){
            List<Integer> subArray = new ArrayList<>();
            for(int j = i; j<v.size(); j++ ){
                subArray.add(v.get(j));
                check(subArray);
            }
        }
        for(int i =0; i< ans.size(); i++){
            System.out.println(" " + ans.get(i));
            result = result | ans.get(i);

        }
        System.out.println();
        System.out.println("result is = "+result);;
    }
}

