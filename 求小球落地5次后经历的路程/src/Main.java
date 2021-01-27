import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int number = 5;
        double second = height * Math.pow(0.5,5);
        ArrayList<Double> record = new ArrayList<>();
        double heightDouble = height;
        double sum = 0;
        for(int i = 0; i < 5; i++){
            record.add(heightDouble + 0.5*heightDouble);
            heightDouble = heightDouble * 0.5;
        }
        double counter = 0;
        for(int i = 0; i < record.size(); i++){
            counter = counter + record.get(i);
        }
        double result = counter - heightDouble;
        System.out.printf("%.6f\n",result);
        System.out.printf("%.6f\n",second);

    }
}
