import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int data = sc.nextInt();
            ArrayList<Integer> result = solution(data);
            //System.out.println(result);

            StringBuffer finalresult = new StringBuffer();
            for(int i = 0; i < result.size(); i++){
                finalresult.append(result.get(i));
                finalresult.append("+");
            }
            finalresult.deleteCharAt(finalresult.length() - 1);
            System.out.println(finalresult);


            /*
            for(int i = 0; i < result.size(); i++){
                if(i != result.size() - 1){
                    System.out.print(result.get(i) + "+");
                }
                else{
                    System.out.println(result.get(i));
                }
            }

             */
        }
    }
    public static ArrayList<Integer> solution(int data){
        int target = (int) Math.pow(data, 3);
        ArrayList<Integer> oddNumber = new ArrayList<>();
        ArrayList<Integer> resultArray = new ArrayList<>();
        if(target == 1){
            oddNumber.add(1);
            return oddNumber;
        }
        for(int i = 1; i <= target; i = i + 2){
            oddNumber.add(i);
        }
        int leftIndex = 0;
        int rightIndex = 0;

        here:
        for(int i = 0; i < oddNumber.size(); i++){
            int result = oddNumber.get(i);
            for(int j = i+1; j < oddNumber.size(); j++){
                result = result + oddNumber.get(j);
                if(result == target){
                    leftIndex = i;
                    rightIndex = j;
                    if(j - i + 1 == data){
                        break here;
                    }

                }
            }
        }

        for(int i = leftIndex; i <= rightIndex; i++){
            resultArray.add(oddNumber.get(i));
        }
        return resultArray;


    }
}
