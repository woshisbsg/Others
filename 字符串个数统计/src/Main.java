import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer data = new StringBuffer(sc.nextLine());
        ArrayList<String> arrData = new ArrayList<>();
        String temp = "";
        int x = 0;
        int y = 0;
        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i) != ';'){
                temp = temp + data.charAt(i);
            }
            else if(data.charAt(i) == ';') {
                if(temp == "" || temp.length() > 3){
                    temp = "";
                    continue;
                }
                else if(temp.length() ==3){
                    if(temp.charAt(0) <65  || temp.charAt(0) > 90 || temp.charAt(1) < 48 || temp.charAt(1) > 57 || temp.charAt(2) < 48 || temp.charAt(2) > 57){
                        temp = "";
                        continue;
                    }
                }
                else if(temp.length() == 2){
                    if(temp.charAt(0) <65  || temp.charAt(0) > 90 || temp.charAt(1) < 48 || temp.charAt(1) > 57 ){
                        temp = "";
                        continue;
                    }
                }

                    arrData.add(temp);
                    temp = "";

            }
        }

        for(int i = 0; i < arrData.size(); i++){
            String movement = arrData.get(i);
            String direction = String.valueOf(movement.charAt(0));
            int stepNumber = 0;
            if(movement.length() == 3){
                stepNumber = Integer.parseInt(String.valueOf(movement.charAt(2))) + Integer.parseInt(String.valueOf(movement.charAt(1))) * 10;
            }
            else if(movement.length() == 2){
                stepNumber = Integer.parseInt(String.valueOf(movement.charAt(1)));
            }

            if(direction.equals("W")){
                y = y + stepNumber;
            }
            else if(direction.equals("S")){
                y = y - stepNumber;
            }
            else if(direction.equals("A")){
                x = x - stepNumber;
            }
            else if(direction.equals("D")){
                x = x + stepNumber;
            }
        }

        System.out.println(x + "," + y);



    }
}
