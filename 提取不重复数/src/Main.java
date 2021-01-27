import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        StringBuffer input = new StringBuffer(sc.nextLine());
        input.reverse();
        ArrayList<String> temp = new ArrayList<>();

        for(int i = 0; i < input.length(); i++){
            if(temp.contains(String.valueOf(input.charAt(i)))){
                continue;
            }
            else {
                temp.add(String.valueOf(input.charAt(i)));
            }
        }
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < temp.size(); i++){
            result.append(temp.get(i));
        }
        String finalresult = result.toString();
        System.out.println(finalresult);

         */
        Scanner sc = new Scanner(System.in);
        StringBuffer input = new StringBuffer(sc.nextLine());
        input.reverse();
        LinkedHashSet<String> temp = new LinkedHashSet<>();
        for(int i = 0; i < input.length(); i++){
            temp.add(String.valueOf(input.charAt(i)));
        }
        ArrayList<String > result = new ArrayList();
        StringBuffer fresult = new StringBuffer();
        Iterator iterator = temp.iterator();
        while(iterator.hasNext()){
            fresult.append((String)iterator.next());
        }


        String finalresult = fresult.toString();
        System.out.println(finalresult);










    }
}
