import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int year = sc.nextInt();
            int month = sc.nextInt();
            int date = sc.nextInt();
            int total = 0;
            for(int i = 1; i < month; i++){
                total = total + days(i);
            }
            total = total + date;
            if(isLeapYear(year)){
                total++;
            }
            System.out.println(total);
        }
    }

    public static boolean isLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0){
            return true;
        }
        else if(year % 100 == 0 && year % 400 == 0){
            return true;
        }
        return false;
    }
    public static int days(int month){
        int day = 0;
        switch (month){
            case 1:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 3:
                day = 31;
                break;
            case 4:
                day = 30;
                break;
                case 5:
                day = 31;
                break;
            case 6:
                day = 30;
                break;
                case 7:
                day = 31;
                break;
            case 8:
                day = 31;
                break;
            case 9:
                day = 30;
                break;
            case 10:
                day = 31;
                break;
                case 11:
                day = 30;
                break;
            case 12:
                day = 31;
                break;

        }
        return day;

    }
}
