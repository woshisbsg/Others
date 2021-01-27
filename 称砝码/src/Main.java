import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            ArrayList<Integer> famaweight = new ArrayList<>();
            for(int i = 0; i < n; i++){
                famaweight.add(sc.nextInt());
            }
            ArrayList<Integer> numberofFama = new ArrayList<>();
            for(int i = 0; i < n; i++){
                numberofFama.add(sc.nextInt());
            }
            ArrayList<Integer> result = new ArrayList<>();
            int counter = 0;
            while(!numberofFama.isEmpty()){
                for(int i = 0; i < numberofFama.get(0); i++){
                    result.add(famaweight.get(counter));
                }
                numberofFama.remove(0);
                counter++;
            }
            HashSet<Integer> possibleCombination = new HashSet<>();
            possibleCombination.add(0);
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(0);
            for(int i = 0; i < result.size(); i++){
                int len = temp.size();
                for(int j = 0; j < len; j++){
                    temp.add(result.get(i) + temp.get(j));
                }
            }
            for(int i = 0; i < temp.size(); i++){
                possibleCombination.add(temp.get(i));
            }
            System.out.println(possibleCombination.size());


        }
    }

}
