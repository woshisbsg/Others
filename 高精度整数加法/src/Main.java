import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a == "" || b == ""){
                System.out.println("???????");
            }
            System.out.println(add(a,b));

        }

    }

    public static String add(String data1, String data2){
        //make sure that data1 has bigger length
        if(data1.length() < data2.length()){
            String temp = data2;
            data2 = data1;
            data1 = temp;
        }

        StringBuffer a = new StringBuffer(data1);
        StringBuffer b = new StringBuffer(data2);

        //remove all the space

        for(int i = 0; i < a.length(); i++){
            if(String.valueOf(a.charAt(i)).equals(" ")){
                a.deleteCharAt(i);
            }
        }
        for(int i = 0; i < b.length(); i++){
            if(String.valueOf(b.charAt(i)).equals(" ")){
                b.deleteCharAt(i);
            }
        }
        //make 2 string to be the same length
        if(a.length() != b.length()){
            StringBuffer tempdata = new StringBuffer(b);
            tempdata.reverse();
            for(int i = 0; i < a.length() - b.length(); i++){
                tempdata.append("0");
            }
            tempdata.reverse();
            b = tempdata;
        }


        a.reverse();
        b.reverse();
        StringBuffer result = new StringBuffer();
        //System.out.println(a.length());
        //System.out.println(b.length());
        int yushu = 0;
        int jinwei = 0;
        for(int i = 0; i < a.length(); i++){
            int temp = 0;
            if(jinwei != 0){
                temp = Integer.parseInt(String.valueOf(a.charAt(i))) + Integer.parseInt(String.valueOf(b.charAt(i))) + jinwei;
                jinwei = 0;
            }
            else{
                //temp = a.charAt(i) + b.charAt(i);
                temp = Integer.parseInt(String.valueOf(a.charAt(i))) + Integer.parseInt(String.valueOf(b.charAt(i)));
            }
            if(temp >= 10){
                yushu = temp - 10;
                jinwei = 1;
                result.append(yushu);
            }
            else{
                yushu = temp;
                result.append(yushu);
            }
        }
        if(jinwei != 0){
            result.append(jinwei);
        }

        result.reverse();
        return result.toString();
    }
}
