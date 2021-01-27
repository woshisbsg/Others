import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int target = sc.nextInt();
            String result = Integer.toString(target,2);
            int counter = 0;
            for(int i = 0; i < result.length(); i++){
                if(String.valueOf(result.charAt(i)).equals("1")){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
