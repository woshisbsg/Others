import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solultion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            String total = a + b;
            //System.out.println(sortString(total));
            String sortedString = sortString(total);
            String result = convert(sortedString);
            System.out.println(result);


        }
    }
    public static String sortString(String total ){
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < total.length(); i = i+2){
            a.add(String.valueOf(total.charAt(i)));
        }
        for(int i = 1; i < total.length(); i = i + 2){
            b.add(String.valueOf(total.charAt(i)));
        }
        Collections.sort(a);
        Collections.sort(b);
        if(a.size() != b.size()){
            for(int i = 0; i < Math.min(a.size(),b.size()); i++){
                result.append(a.get(i));
                result.append(b.get(i));
            }
            result.append(a.get(a.size() - 1));
        }
        else{
            for(int i = 0; i < a.size(); i++){
                result.append(a.get(i));
                result.append(b.get(i));
            }
        }

        return result.toString();

    }

    public static String convert(String input){
        //ArrayList<String> binaryresult = new ArrayList<>();
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < input.length(); i++){
            String temp = String.valueOf(input.charAt(i));
            if(temp.matches("[0-9]||[a-f]||[A-F]")){
                int shijinzhi = Integer.parseInt(temp,16);
                String erjinzhi = Integer.toString(shijinzhi,2);
                StringBuffer erjinzhibuffer = new StringBuffer(erjinzhi);
                if(erjinzhibuffer.length() < 4){
                    StringBuffer tempsb = new StringBuffer();
                    for(int j = 0; j < 4 -erjinzhibuffer.length(); j++){
                        tempsb.append("0");
                    }
                    tempsb.append(erjinzhibuffer);
                    erjinzhibuffer = tempsb;
                }

                erjinzhibuffer.reverse();
                int resultshijinzhi = Integer.parseInt(erjinzhibuffer.toString(),2);
                String resulthex = Integer.toString(resultshijinzhi,16);
                if(resulthex.matches("[a-f]")){
                    resulthex = resulthex.toUpperCase();
                }
                result.append(resulthex);
            }
            else{
                result.append(temp);
            }

        }
        return result.toString();
    }

}
