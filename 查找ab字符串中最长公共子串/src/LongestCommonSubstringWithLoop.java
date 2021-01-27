import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String data1 = sc.nextLine();
            String data2 = sc.nextLine();
            compare(data1,data2);
        }
    }
    public static void compare(String data1, String data2){
        //make sure data1 is the shorter one
        if(data1.length() > data2.length()){
            String temp = data2;
            data2 = data1;
            data1 = temp;
        }
        String max = "";
        int maxlen = 0;
        for(int i = 0; i < data1.length(); i++){
            for(int j = i+1; j < data1.length() + 1; j++){
                String temp  = data1.substring(i,j);
                if(data2.contains(temp)){
                    if(temp.length() > maxlen){
                        maxlen = temp.length();
                        max = temp;
                    }

                }
            }
        }
        System.out.println(max);
    }
}
