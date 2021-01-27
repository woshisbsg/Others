import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String data = "abc1234321ab";
        Main a = new Main();

        System.out.println(a.getLongestPalindrome(data, data.length()));

    }
    public int getLongestPalindrome(String A, int n) {
        // write code here
        ArrayList<String> combination = new ArrayList<>();
        for(int i = 0; i < A.length(); i++){
            for(int j = i + 1; j <= A.length(); j++){
                String temp = A.substring(i,j);
                combination.add(temp);
            }
        }
        //System.out.println(combination);
        int max = 0;
        for(String s : combination){
            if(ispalindrom(s)){
                if(s.length() > max){
                    max = s.length();
                }
            }
        }

        return max;

    }

    public static boolean ispalindrom(String data){
        StringBuffer input = new StringBuffer(data);
        return input.reverse().toString().equals(data);
    }
}
