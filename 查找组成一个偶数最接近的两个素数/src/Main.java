import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int target = sc.nextInt();
            //System.out.println(getAllPrime(target));
            int result = closestPrimePair(getAllPrime(target), target);
            //System.out.println(result);
            System.out.println(result);
            System.out.println(target - result);


        }
    }

    public static int closestPrimePair(ArrayList<Integer> data, int target){
        for(int i = 0; i < data.size(); i++){
            if(isPrime(target - data.get(i))){
                return data.get(i);
            }
        }
        return 0;
    }

    public static ArrayList<Integer> getAllPrime(int data){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = data/2; i >= 2; i--){
            if(isPrime(i)){
                result.add(i);
            }
        }
        return result;
    }

    public static boolean isPrime(int data){
        for(int i = 2; i <= data / 2; i++){
            if(data % i == 0){
                return false;
            }
        }
        return true;
    }
}
