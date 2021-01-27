import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int arrLen1 = sc.nextInt();
            ArrayList<Integer> arr1 = new ArrayList();
            ArrayList<Integer> arr2 = new ArrayList<>();
            TreeSet<Integer> result= new TreeSet<>();
            for(int i = 0; i < arrLen1; i++){
                result.add(sc.nextInt());
            }
            int arrLen2 = sc.nextInt();
            for(int i = 0; i < arrLen2; i++){
                result.add(sc.nextInt());
            }

            //System.out.println(result);
            int len = result.size();
            for(int i = 0; i < len; i++){
                System.out.print(result.pollFirst());
            }
            System.out.println();


        }
    }
}
