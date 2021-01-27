import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> filename = new ArrayList();
        ArrayList<String> filenamefinal = new ArrayList();
        HashMap<String, Integer> data = new HashMap<>();
        int times = 1;
        while(!sc.hasNext("@")){
            String s = sc.nextLine();
            StringBuffer temp1 = new StringBuffer(s);
            StringBuffer temp2 = new StringBuffer();
            temp1.reverse();
            for(int i = 0; i < 20; i++){
                if(temp1.charAt(i) != '\\'){
                    temp2.append(temp1.charAt(i));
                }
                else{
                    break;
                }
            }
            temp2.reverse(); // temp2 就是有效的文件名
            if(!filename.contains(temp2.toString())){
                filename.add(temp2.toString());
            }

            if(data.containsKey(temp2.toString())){
                int temp = data.get(temp2.toString());
                temp++;
                data.replace(temp2.toString(), temp);
            }
            else{
                data.put(temp2.toString(), times);
            }
        }

        if(filename.size() >= 8){
            for(int i = filename.size() - 1; i >= (filename.size() -8); i--){
                filenamefinal.add(filename.get(i));
            }
        }
        else{
            for(int i = filename.size() - 1; i >= 0; i--){
                filenamefinal.add(filename.get(i));
            }
        }


        /*
        for(int i = 0; i < filenamefinal.size(); i++){
            System.out.println(filenamefinal.get(i));
        }

         */

        filename.clear();

        for(int i = filenamefinal.size() - 1; i >= 0; i--){
            filename.add(filenamefinal.get(i));
        }
        /*
        for(int i = 0; i < filenamefinal.size(); i++){
            System.out.println(filename.get(i));
        }

         */

        for(int i = 0; i < filenamefinal.size(); i++){
            System.out.println(filename.get(i) + " " + data.get(filename.get(i)));
        }









        //System.out.println(data);




    }
}
