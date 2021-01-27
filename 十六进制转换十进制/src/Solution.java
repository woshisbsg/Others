import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList();
        Stack<String> temp = new Stack<>();


        while(sc.hasNext()){
            double result = 0;
            String number = sc.nextLine();
            number = number.substring(2);
            for(int i = 0; i < number.length(); i++){
                if(number.charAt(i) == 'A'){
                    temp.push("10");
                }
                else if(number.charAt(i) == 'B'){
                    temp.push("11");
                }
                else if(number.charAt(i) == 'C'){
                    temp.push("12");
                }
                else if(number.charAt(i) == 'D'){
                    temp.push("13");
                }
                else if(number.charAt(i) == 'E'){
                    temp.push("14");
                }
                else if(number.charAt(i) == 'F'){
                    temp.push("15");
                }
                else{
                    temp.add(String.valueOf(number.charAt(i)));
                }
            }
            int stackSize = temp.size();
            for(int i = 0; i < stackSize; i++){
                result = result + (Integer.parseInt(temp.pop()) * Math.pow(16,i));
            }
            int finalresult = (int)result;
            //System.out.println(finalresult);
            al.add(finalresult);
        }

        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }

         */

        ArrayList<Integer> finalresult = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String number = sc.nextLine();
            int result = Integer.valueOf(number.substring(2),16);
            finalresult.add(result);
            System.out.println("123123");
        }
        for(int i = 0 ; i < finalresult.size(); i++){
            System.out.println(finalresult.get(i));
        }
    }
}
