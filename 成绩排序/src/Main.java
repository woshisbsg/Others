import sun.awt.image.ImageWatched;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int numberOfStudent = sc.nextInt();
            int order = sc.nextInt();
            ArrayList<Integer> listScore = new ArrayList<>();
            LinkedHashMap<String, Integer> nameWithScore = new LinkedHashMap<>();
            for (int i = 0; i < numberOfStudent; i++) {
                String name = sc.next();
                int score = sc.nextInt();
                nameWithScore.put(name + " " + score, score);
            }
            Set<Map.Entry<String, Integer>> setEntry = nameWithScore.entrySet();
            LinkedList<Map.Entry<String, Integer>> listWithEntrySet = new LinkedList<>(setEntry);

            Collections.sort(listWithEntrySet, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });

            LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
            if(order == 0){
                Collections.reverse(listWithEntrySet);
            }
            for(int i = 0; i < listWithEntrySet.size(); i++){
                result.put(listWithEntrySet.get(i).getKey(), listWithEntrySet.get(i).getValue());
            }

            for(String s : result.keySet()){
                System.out.println(s);
            }




        }
    }
}
