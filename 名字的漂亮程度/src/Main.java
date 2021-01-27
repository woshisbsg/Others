import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            ArrayList<String> name = new ArrayList<>();
            ArrayList<Integer> finalresult = new ArrayList<>();
            String numberofname = sc.nextLine();
            int n = Integer.valueOf(numberofname);
            for(int i = 0; i < n; i++){
                name.add(sc.nextLine());
            }
            HashMap<String, Integer> test = new HashMap<>();
            for(int i = 0; i < name.size(); i++){
                StringBuffer temp = new StringBuffer(name.get(i));
                ArrayList<Integer> numberOfApperance = new ArrayList<>();
                while(temp.length() != 0){
                    String current = String.valueOf(temp.charAt(0));
                    int counter = 0;
                    for(int j = 0; j < temp.length(); j++){
                        if(current.equals(String.valueOf(temp.charAt(j)))){
                            temp.deleteCharAt(j);
                            counter++;
                            j = -1;
                        }
                    }
                    numberOfApperance.add(counter);
                    test.put(current,counter);
                }
                Collections.sort(numberOfApperance);
                Collections.reverse(numberOfApperance);

                int finalvalue = 0;
                int value = 26;
                for(int j = 0; j < numberOfApperance.size(); j++){
                    finalvalue = finalvalue + value * numberOfApperance.get(j);
                    value--;
                }
                finalresult.add(finalvalue);
            }
            for(int i = 0; i < finalresult.size(); i++){
                System.out.println(finalresult.get(i));
            }
        }

    }
}
