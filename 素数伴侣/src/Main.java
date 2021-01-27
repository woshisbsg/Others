import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int number = sc.nextInt();
            ArrayList<Integer> oddNumber = new ArrayList<>(); // all even number could be considered as candidates on the left side
            ArrayList<Integer> evenNumber= new ArrayList<>(); // all odd number could be considered as candidates on the right side
            ArrayList<Integer> input = new ArrayList<>();
            for(int i = 0 ;i < number; i++){
                input.add(sc.nextInt());
            }
            for(int i = 0; i < input.size(); i++){
                if(oddOrEven(input.get(i))){
                    evenNumber.add(input.get(i));
                }
                else{
                    oddNumber.add(input.get(i));
                }
            }

            int[] evensMatch = new int[evenNumber.size()];
            int result = 0;
            for (int i = 0; i < oddNumber.size(); i++) {
                int[] used = new int[evenNumber.size()];
                if (find(oddNumber.get(i), evenNumber, used, evensMatch)) {
                    result++;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }



    public static boolean oddOrEven(int data){
        if(data % 2 == 0){
            return true; // data is even
        }
        else{
            return false; // data is odd
        }
    }
    public static boolean isPrime(int data){
        for(int i = 2; i < data/2; i++){
            if(data % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean find(int x, ArrayList<Integer> evens, int[] used, int[] evensMatch) {
        int j;
        for (j = 0; j < evens.size(); j++) {
            if (isPrime(x + evens.get(j)) && used[j] == 0) {
                used[j] = 1;
                if (evensMatch[j] == 0 || find(evensMatch[j], evens, used, evensMatch)) {
                    evensMatch[j] = x;
                    return true;
                }
            }
        }
        return false;
    }
}
