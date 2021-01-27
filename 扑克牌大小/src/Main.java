import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            StringBuffer orginaldata = new StringBuffer(sc.nextLine());
            StringBuffer handOne = new StringBuffer();
            StringBuffer handTwo = new StringBuffer();
            while(true){
                if(orginaldata.charAt(0) != '-'){
                    handOne.append(orginaldata.charAt(0));
                    orginaldata.deleteCharAt(0);
                }
                else{
                    orginaldata.deleteCharAt(0);
                    break;
                }
            }
            handTwo = orginaldata;
            //System.out.println(handOne);
           // System.out.println(handTwo);
            //System.out.println(transferHands(handOne.toString()));
            //System.out.println(transferHands(handTwo.toString()));
            String result = compareHands(transferHands(handOne.toString()), transferHands(handTwo.toString()));
            if(result.contains("15") || result.contains("16") || result.contains("11") || result.contains("12")|| result.contains("13")|| result.contains("14") || result.contains("17")){
                result = result.replace("11", "J");
                result = result.replace("12", "Q");
                result = result.replace("13", "K");
                result = result.replace("14", "A");
                result = result.replace("15", "2");
                result = result.replace("16", "joker");
                result = result.replace("17", "JOKER");
            }

            System.out.println(result);





        }
    }

    public static String compareHands(ArrayList<Integer> handOne, ArrayList<Integer> handTwo){

        if(isBoom(handOne) && isBoom(handTwo)){
            if(handOne.get(0) > handTwo.get(0)){
                return listToStringConverter(handOne);
            }
            else{
                return listToStringConverter(handTwo);
            }
        }
        else if(isBoom(handOne)){
            return listToStringConverter(handOne);
        }
        else if(isBoom(handTwo)){
            return listToStringConverter(handTwo);
        }
        else if(handOne.size() == handTwo.size()){
            if(handOne.get(0) > handTwo.get(0)){
                return listToStringConverter(handOne);
            }
            else{
                return listToStringConverter(handTwo);
            }
        }
        else{
            return "ERROR";
        }


    }

    public static ArrayList<Integer> transferHands(String data){
        ArrayList<Integer> result = new ArrayList<>();
        String[] inputArr = data.split(" ");

        for(int i = 0; i < inputArr.length; i++){
            int temp = 0;
            switch (inputArr[i]){
                case "A" :
                    temp = 14;
                    break;
                case "J" :
                    temp = 11;
                    break;
                case "Q" :
                    temp = 12;
                    break;
                case "K":
                    temp = 13;
                    break;
                case "joker" :
                    temp = 16;
                    break;
                case "JOKER" :
                    temp = 17;
                    break;
                case "10" :
                    temp = 10;
                    break;
                case "2" :
                    temp = 15;
                    break;

            }
            if(inputArr[i].matches("[3-9]")){
                temp = Integer.parseInt(inputArr[i]);
            }
            result.add(temp);


        }
        return result;
    }

    public static boolean isBoom(ArrayList<Integer> data){
        if(data.size() == 2){
            if(data.contains(16) && data.contains(17)){
                return true;
            }
        }
        else if(data.size() == 4){
            if(data.get(0) == data.get(1) && data.get(1) == data.get(2) && data.get(2) == data.get(3)){
                return true;
            }
        }

        return false;
    }

    public static String listToStringConverter(ArrayList<Integer> data){
        StringBuffer temp = new StringBuffer();
        for(int i = 0; i < data.size(); i++){
            temp.append(data.get(i));
            temp.append(" ");
        }
        temp.deleteCharAt(temp.length() - 1);
        return temp.toString();
    }




}
