import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String password = sc.nextLine();
            int result = length(password) + containLetters(password) + containSign(password) + containNumbers(password) + bonus(password);
            /*
            String data = "38$@NoNoNo";
            System.out.println(length(data));
            System.out.println(containLetters(data));
            System.out.println(containNumbers(data));
            System.out.println(containSign(data));
            System.out.println(bonus(data));

             */
            //System.out.println(result);
            if(result >= 90){
                System.out.println("VERY_SECURE");
            }
            else if(result >= 80){
                System.out.println("SECURE");
            }
            else if(result >= 70){
                System.out.println("VERY_STRONG");
            }
            else if(result >= 60){
                System.out.println("STRONG");
            }else if(result >= 50){
                System.out.println("AVERAGE");
            }else if(result >= 25){
                System.out.println("WEAK");
            }
            else {
                System.out.println("VERY_WEAK");
            }







        }

    }

    public static int length(String data){
        int len = data.length();
        if(len <= 4){
            return  5;
        }
        else if(len <= 7){
            return 10;
        }
        else{
            return 25;
        }
    }

    public static int containLetters(String data){
        int counter = 0;
        for(int i = 0; i < data.length(); i++){
            if(Character.isLetter(data.charAt(i))){
                counter++;
            }
        }
        if(counter == 0){
            return 0;
        }
        int upperCounter = 0;
        int lowerCounter = 0;
        for(int i = 0; i < data.length(); i++){
            if(Character.isUpperCase(data.charAt(i))){
                upperCounter++;
            }
            if(Character.isLowerCase(data.charAt(i))){
                lowerCounter++;
            }
        }
        if(counter == upperCounter || counter == lowerCounter){
            return 10;
        }
        return 20;
    }

    public static int containNumbers(String data){
        int counter = 0;
        for(int i = 0; i < data.length(); i++){
            if(String.valueOf(data.charAt(i)).matches("[0-9]")){
                counter++;
            }
        }
        if(counter == 0){
            return 0;
        }
        else if(counter == 1){
            return 10;
        }
        else{
            return 20;
        }
    }

    public static int containSign(String data){
        int counter = 0;
        for(int i = 0; i < data.length(); i++){
            if(!Character.isLetter(data.charAt(i)) && !String.valueOf(data.charAt(i)).matches("[0-9]")){
                counter++;
            }
        }
        if(counter == 0){
            return 0;
        }
        else if(counter == 1){
            return 10;
        }
        else{
            return 25;
        }
    }

    public static int bonus(String data){
        ArrayList<Integer> result = new ArrayList<>();
        if(containNumbers(data) != 0 && containLetters(data) != 0){
            result.add(2);
        }
        if(containNumbers(data) != 0 && containLetters(data) != 0 && containSign(data) != 0){
            result.add(3);
        }
        if(containLetters(data) == 20 && containNumbers(data) != 0 && containSign(data) != 0){
            result.add(5);
        }
        else{
            result.add(0);
        }
        Collections.sort(result);
        Collections.reverse(result);
        return result.get(0);
    }




}

