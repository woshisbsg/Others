import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String > result = new ArrayList<>();

        while(sc.hasNext()){
            StringBuffer stringBuffer = new StringBuffer();
            String temp = sc.nextLine();
            if(temp.length() < 8){
                stringBuffer.append(temp);
                for(int i = 0; i < 8-temp.length(); i++){
                    stringBuffer.append("0");
                }
                result.add(stringBuffer.toString());
            }
            else if(temp.length() == 8){
                result.add(temp);
            }
            else if(temp.length() > 8){
                stringBuffer.append(temp);
                if(temp.length() % 8 == 0){
                    for(int i = 0; i < temp.length(); i= i + 8){
                        result.add(stringBuffer.substring(i,i+8));
                    }
                }
                else if(temp.length() % 8 != 0){
                    int len1 = temp.length() - (temp.length()%8);
                    for(int i = 0; i < len1; i = i + 8){
                        result.add(stringBuffer.substring(0,8));
                        stringBuffer.delete(0,8);
                    }
                    int len = 8 -stringBuffer.length();
                    for(int i = 0; i < len; i++){
                        stringBuffer.append("0");
                    }
                    result.add(stringBuffer.toString());
                }
            }
        }
        String[] finalresult = result.toArray(new String[0]);

        for(int i = 0; i < finalresult.length; i++){
            System.out.println(finalresult[i]);
        }

    }

}
