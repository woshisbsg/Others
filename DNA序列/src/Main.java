import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String data = sc.nextLine();
            int len = sc.nextInt();
            if(len == data.length()){
                System.out.println(data);
                return;
            }

            System.out.println(highestRatioSubarray(data,len));

        }

    }
    public static String highestRatioSubarray(String data, int len){
        StringBuffer input = new StringBuffer(data);
        ArrayDeque<String> dq = new ArrayDeque<>();
        ArrayList<Double> GCRatioResult = new ArrayList<>();
        if(input.length() < len){
            return null;
        }
        for(int i = 0; i < len; i++){
            dq.add(String.valueOf(input.charAt(0)));
            input.deleteCharAt(0);
        }

        //GCRatioResult.add();
        double max = GCRatio(dequeConvertToString(dq));
        ArrayDeque<String> dq1 = new ArrayDeque<>();
        dq1 = dq.clone();
        int lenInput = input.length();
        for(int i = 0; i < lenInput; i++){
            String temp = String.valueOf(input.charAt(0));
            dq.pop();
            dq.add(temp);
            //GCRatioResult.add(GCRatio(dequeConvertToString(dq)));
            if(GCRatio(dequeConvertToString(dq)) > max){
                max = GCRatio(dequeConvertToString(dq));
                dq1 = dq.clone();
            }
            input.deleteCharAt(0);
        }
        String result = dequeConvertToString(dq1);
        return result;


    }

    public static double GCRatio(String data){
        double counter = 0;
        for(int i = 0; i < data.length(); i++){
            if(String.valueOf(data.charAt(i)).equals("G") || String.valueOf(data.charAt(i)).equals("C") ){
                counter++;
            }
        }
        double result = (double)counter / data.length();
        return result;
    }

    public static String dequeConvertToString(ArrayDeque<String> data){
        String[] temp = data.toArray(new String[0]);
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < temp.length; i++){
            sb.append(temp[i]);
        }
        return sb.toString();
    }
}
