import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            StringBuffer sb = new StringBuffer(s);
            StringBuffer tempresult = new StringBuffer();
            StringBuffer result = new StringBuffer();
            ArrayList<String> temp = new ArrayList<>();
            for(int i = 0; i < sb.length(); i++){
                if(getBoolean(sb.charAt(i))){
                    tempresult.append(sb.charAt(i));
                }
            }
            for(int i = 0; i < tempresult.length(); i++){
                temp.add(String.valueOf(tempresult.charAt(i)));
            }
            Collections.sort(temp, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareToIgnoreCase(o2);
                }
            });
            for(int i = 0; i < sb.length(); i++){
                if(!getBoolean(sb.charAt(i))){
                    temp.add(i,String.valueOf(sb.charAt(i)));
                }
            }

            for(int i = 0; i < temp.size(); i++){
                result.append(temp.get(i));
            }
            System.out.println(result);

        }
    }
    private static boolean getBoolean(char c){
        return  String.valueOf(c).matches("[a-zA-Z]");
    }
}
