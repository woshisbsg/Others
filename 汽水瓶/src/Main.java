import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNext("0")){
            int empty = Integer.parseInt(sc.nextLine());
            if(empty == 1){
                System.out.println("0");
            }
            if(empty == 2){
                System.out.println("1");
            }
            if(empty >= 3){
                System.out.println(solution(empty));

            }
        }
    }

    public static int solution(int empty){
        int newbottle = 0;
        int counter = 0;
        int remainning = 0;
        while(empty != 1 && empty != 2){
            newbottle = empty/3;
            remainning = empty % 3;
            counter = counter + newbottle;
            empty = remainning + newbottle;
            //System.out.println("????????????????????");
        }
        if(empty == 2){
            counter++;
        }

        return counter;

    }
}
