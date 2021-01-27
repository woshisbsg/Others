import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int counter = 0;
            int target = sc.nextInt();
            for(int i = 1; i <= target; i++){
                if(perfectNumber(i)){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }

    public static boolean perfectNumber(int target){
        ArrayList<Integer> component = new ArrayList<>();
        int total = 0;
        for(int i = 1; i < target; i++){
            if(target % i == 0){
                component.add(i);
            }
        }
        for(int i = 0; i < component.size(); i++){
            total = total + component.get(i);
        }
        if(total == target){
            return true;
        }
        else return false;
    }
}
