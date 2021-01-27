import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.nextLine();
            //ArrayList<Integer> charaterList = new ArrayList();
            int[] charaterarray = new int[input.length()];
            ArrayList<Character> resultList = new ArrayList<>();
            for (int i = 0; i < input.length(); i++) {
                charaterarray[i] = (int) input.charAt(i);
            }
            Arrays.sort(charaterarray);
            for(int i = 0; i < charaterarray.length; i++){
                resultList.add((char)charaterarray[i]);
            }
            //System.out.println(resultList);
            for(int i = 0; i < resultList.size(); i++){
                System.out.print(resultList.get(i));
                if(i == resultList.size() - 1){
                    System.out.println();
                }
            }
        }
    }
}
