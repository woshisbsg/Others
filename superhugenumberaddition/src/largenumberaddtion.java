import java.util.Scanner;

public class largenumberaddtion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(hugeNumberAddition(a,b));


    }

    public static String hugeNumberAddition (String a, String b){
        String temp = "";
        String result = "";
        //boolean jinwei = false;
        int currentdigit = 0;
        int w = 0; //进位
        if(a.length() > b.length()){
            temp = a;
            a = b;
            b = temp;
        }
        int difference = b.length() - a.length();
        for(int i = 0; i < difference; i++){
            a = "0" + a;
        }

        for(int i = b.length()-1; i >= 0 ; i--){
            currentdigit = b.charAt(i) + a.charAt(i) -96 + w;
            w = currentdigit/10;
            result = (currentdigit%10) + result;


        }
        if(w ==1){
            result = 1+result;
        }

        return result;

    }
}
