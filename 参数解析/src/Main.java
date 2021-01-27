import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String target = sc.nextLine();
            StringBuffer temp = new StringBuffer();
            ArrayList<String> result = new ArrayList<>();
            int counter = 0;
            for(int i = 0; i < target.length(); i++){
                if(target.charAt(i) != 34 && target.charAt(i) != ' '){
                    temp.append(target.charAt(i));
                }
                else if(target.charAt(i) == ' '){
                    //temp.append(" ");
                    result.add(temp.toString());
                    temp.delete(0,temp.length());
                    counter++;
                }
                else if(target.charAt(i) == 34){
                    for(int j = i + 1; j < target.length(); j++){
                        if(target.charAt(j) == 34){
                            i = j + 1;
                            result.add(temp.toString());
                            temp.delete(0,temp.length());
                            counter++;
                            break;
                        }
                        else{
                            temp.append(target.charAt(j));
                        }
                    }
                }

            }
            if(temp.length() !=0){
                result.add(temp.toString());
                counter++;
            }
            System.out.println(counter);
            for(int i = 0; i < result.size(); i++){
                System.out.println(result.get(i));
            }

        }
    }
}
