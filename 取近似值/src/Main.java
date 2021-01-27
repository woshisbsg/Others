import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = sc.nextInt();
        for(int i = 0; i < len; i++){
            int key = sc.nextInt();
            int value = sc.nextInt();
            if(hm.containsKey(key)){
                hm.put(key,(hm.get(key) + value));
            }
            else{
                hm.put(key,value);
            }
        }


        Set<Integer> temp = hm.keySet();
        int[] arraytemp = temp.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arraytemp);

        for(int i = 0; i < hm.size(); i++){
            System.out.println(arraytemp[i] + " "+ hm.get(arraytemp[i]));
        }



    }
}