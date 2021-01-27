import java.util.Scanner;

public class Main {
    public static String[] num1 = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    public static String[] num2 = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen","seventeen", "eighteen", "nineteen" };
    public static String[] num3 = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty","ninety" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            System.out.println(parse(num));
        }
        sc.close();
    }

    public static String parse(int data){
        if(data < 0){
            return "error";
        }
        StringBuilder sb = new StringBuilder();
        int billion = data / 1000000000;
        if(billion != 0){
            sb.append(trans(billion) + "billion ");
        }
        data = data % 1000000000;

        int million = data / 1000000;
        if(million != 0){
            sb.append(trans(million) + "million ");
        }
        data = data % 1000000;

        int thousand = data / 1000;
        if(thousand != 0){
            sb.append(trans(thousand) + "thousand ");
        }
        data = data % 1000;

        if(data != 0){
            sb.append(trans(data));
        }
        return sb.toString();
    }
    public static String trans(int data){
        StringBuilder sb = new StringBuilder();
        int hundred = data/100;
        if(hundred != 0){
            sb.append(num1[hundred] + " " + "hundred ");
        }
        data = data % 100;
        if(hundred != 0){
            sb.append("and ");
        }
        int decades = data / 10;
        data = data % 10;
        int digit = data;

        if(decades > 1){
            sb.append(num3[decades - 2] + " ");
        }
        else if( decades == 1){
            sb.append(num2[digit] + " ");
            return sb.toString();
        }
        if(digit != 0){
            sb.append(num1[digit] + " ");
        }

        return sb.toString();

    }
}
