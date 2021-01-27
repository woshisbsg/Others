import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int start = sc.nextInt();
            for(int i = 0 ; i <= 20; i++){
                for(int j = 0; j <= (100 - (5*i)) / 3; j++){
                    for(int k = 0; k <= (100 - (5*i) - (j*3)) * 3; k= k + 3){
                        if(i*5 + j*3 + k/3 == 100 && i + j + k == 100){
                            System.out.print(i + " ");
                            System.out.print(j + " ");
                            System.out.print(k + " ");
                            System.out.println();
                        }
                    }
                }
            }

    }
}
