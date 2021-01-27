import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.solve("733064366","459309139"));
    }
    public String solve (String s, String t) {

        /*

        String[] number1 = s.split("");
        String[] number2 = t.split("");


        int[] intnumber1 = new int[number1.length];
        for(int i = 0; i < number1.length; i++){
            intnumber1[i] = Integer.parseInt(number1[i]);
        }

        int[] intnumber2 = new int[number2.length];

        for(int i = 0; i < number2.length; i++){
            intnumber2[i] = Integer.parseInt(number2[i]);
        }

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for(int i = 0; i < number1.length; i++){
            stack1.push(intnumber1[i]);
        }

        for(int i = 0; i < number2.length; i++){
            stack2.push(intnumber2[i]);
        }

        Stack<Integer> result = new Stack<>();
        int jinwei = 0;
        int tempresult = 0;

        while(!stack1.isEmpty() && !stack2.isEmpty()){
            tempresult = stack1.pop() + stack2.pop();
            if(tempresult + jinwei >= 10){
                result.push(tempresult + jinwei - 10);
            }
            else{
                result.push(tempresult + jinwei);
            }


            if(tempresult + jinwei >= 10){
                jinwei = 1;
            }
            else{
                jinwei = 0;
            }
        }

        while(!stack1.isEmpty()){
            if(stack1.peek() + jinwei >=10){
                result.push(stack1.pop() + jinwei - 10);
                jinwei = 1;
            }
            else {
                result.push(stack1.pop());
            }
        }


        while(!stack2.isEmpty()){
            if(stack2.peek() + jinwei >=10){
                result.push(stack2.pop() + jinwei - 10);
                jinwei = 1;
            }
            else {
                result.push(stack2.pop());
            }
        }

        if(stack1.isEmpty() && stack2.isEmpty() && jinwei == 1){
            result.push(1);
        }



        String finalresult = "";

        while(!result.isEmpty()){
            finalresult = finalresult + result.pop();
        }

        return finalresult;

         */

        StringBuilder number = new StringBuilder();



        if(s.length() < t.length()){
            String temp = s;
            s = t;
            t = temp;
        }
        int carry = 0;
        int result = 0;

        for(int i = 0; i < t.length(); i++){
            result =  (s.charAt(s.length() - 1 - i) - '0')+ (t.charAt(t.length() -  1 - i)) - '0' + carry;
            number.append(result % 10);
            carry = result / 10;

        }
        for(int i = t.length(); i < s.length(); i++){
            result = (s.charAt(s.length() - 1 - i) - '0') + carry;
            number.append(result % 10);
            carry = result/10;
        }

        if(carry != 0){
            number.append(carry);
        }

        StringBuilder finalresult = number.reverse();
        String fresult = finalresult.toString();
        return fresult;



    }
}
