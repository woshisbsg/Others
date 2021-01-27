import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int counter = 0;
            ArrayList<Integer> temp = new ArrayList<>();
            int target = sc.nextInt();
            for(int i = 1; i <= target; i++){
                if(timesSeven(i) || containSenven(i)){
                    counter++;
                    temp.add(i);
                }
            }
            System.out.println(counter);
            //System.out.println(temp);
        }
    }
    public static boolean timesSeven(int currentNumber){
        if(currentNumber % 7 == 0){
            return true;
        }
        return false;
    }
    public static boolean containSenven(int currentNumber){
        String number = String.valueOf(currentNumber);
        for(int i = 0; i < number.length(); i++){
            if(String.valueOf(number.charAt(i)).equals("7")){
                return true;
            }
        }
        return false;
    }
}
