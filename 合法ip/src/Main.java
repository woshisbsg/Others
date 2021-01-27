import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String target = sc.nextLine();
            //System.out.println(parseIP(target));
            if(parseIP(target)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean parseIP(String data){
        int counter = 0;
        boolean result = true;
        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i) == '.'){
                counter++;
            }
        }
        if(counter != 3){
            return false;
        }

        String[] temp = data.split("\\.");
        for(int i = 0; i < temp.length; i++){
            if(!(Integer.parseInt(temp[i])<= 255) || !(Integer.parseInt(temp[i]) >=0)){
                return false;
            }
        }
        return true;

    }
}
