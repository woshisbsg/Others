import java.io.BufferedInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        long number = sc.nextLong();
        int temp = 2;

        while(number != 1 && temp <= Math.sqrt(number)){
                if(number % temp == 0){
                    number = number / temp;
                    System.out.print(temp + " ");
                    continue;
                }
                else{
                    temp++;
                }
        }
        if(number > 1){
            System.out.print(number + " ");
        }

    }
}
