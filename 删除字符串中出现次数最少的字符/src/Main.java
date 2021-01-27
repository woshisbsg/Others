import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> finalresult = new ArrayList<>();
        while (sc.hasNext()){
            String s = sc.nextLine();
            StringBuffer sb = new StringBuffer(s);
            StringBuffer result = new StringBuffer();
            HashMap<String, Integer> map = new HashMap<>();
            int counter2 = 1;
            while(sb.length() != 0){
                int counter1 = 0;
                String temp = String.valueOf(sb.charAt(counter1));
                for(int i = 1; i < sb.length(); i++){
                    if(String.valueOf(sb.charAt(i)).equals(temp)){
                        counter2++;
                        sb.deleteCharAt(i);
                        i--;
                    }
                }
                map.put(temp, counter2);
                sb.deleteCharAt(counter1);
                counter2 = 1;

            }
            //System.out.println("?????????????????????????????");
            // System.out.println(map);

            Set k = map.keySet();
            Iterator iterator = k.iterator();
            String firstkey = (String) iterator.next();
            int firstvalue = map.get(firstkey);
            String minkey = firstkey;
            while(iterator.hasNext()){
                String temp = (String) iterator.next();
                if(map.get(temp) < firstvalue){
                    minkey = temp;
                }
            }
            int minvalue = map.get(minkey);

            ArrayList<String> al = new ArrayList();
            Iterator iterator1 = k.iterator();
            while(iterator1.hasNext()){
                String temp = (String) iterator1.next();
                if(map.get(temp) == minvalue){
                    al.add(temp);
                }
            }
            boolean status = true;
            for(int i = 0; i < s.length(); i++){
                for(int j = 0; j < al.size(); j++){
                    if(String.valueOf(s.charAt(i)).equals(al.get(j))){
                        status = false;
                    }
                }
                if(status == true){
                    result.append(s.charAt(i));
                }
                else{
                    status = true;
                }
            }
            //System.out.println(result);
            finalresult.add(result.toString());
        }

        for(int i = 0; i < finalresult.size(); i++){
            System.out.println(finalresult.get(i));
        }

    }
}
