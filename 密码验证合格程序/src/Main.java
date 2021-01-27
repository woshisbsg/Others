import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        while(!sc.hasNext("@")){
            String password = sc.nextLine();
            boolean upperCase = false;
            boolean lowerCase = false;
            boolean signs = false;
            boolean numbers = false;
            boolean total = true;
            if(password.length() <= 8){
                total = false;
            }

            //4 conditions
            for(int i = 0; i < password.length(); i++){
                if(password.charAt(i)>= 65 && password.charAt(i) <= 90){
                    upperCase = true;
                }
                else if(password.charAt(i)>= 97 && password.charAt(i) <= 122){
                    lowerCase = true;
                }
                else if(password.charAt(i)>= 48 && password.charAt(i) <= 57){
                    numbers = true;
                }
                else{
                    signs = true;
                }
            }
            ArrayList<Boolean> format = new ArrayList<>();
            format.add(upperCase);
            format.add(lowerCase);
            format.add(signs);
            format.add(numbers);
            int counter = 0;
            for(int i = 0; i < format.size(); i++){
                if(format.get(i)){
                    counter++;
                }
            }
            if(counter < 3){
                //System.out.println("NG");
                total = false;
            }


            //commonpart

            for(int i = 0; i < password.length()-2; i++){
                String temp = password.substring(i,i+3);
                if(password.substring(i+3).contains(temp)){
                    //System.out.println("NG");
                    total = false;
                }
            }

            if(total){
                result.add("OK");
            }
            else{
                result.add("NG");
            }
        }

        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }
}
