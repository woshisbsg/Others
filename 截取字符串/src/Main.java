import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.nextLine();
            String number = sc.nextLine();
            int k = Integer.valueOf(number);
            StringBuffer temp = new StringBuffer(input);
            StringBuffer result = new StringBuffer();
            for(int i = 0; i < k; i++){
                result.append(temp.charAt(i));
            }
            System.out.println(result.toString());
        }
    }
}