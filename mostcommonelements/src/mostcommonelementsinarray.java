public class mostcommonelementsinarray {
    public static void main(String[] args) {
        int[] a = new int[]{1,1,1,1,2,2,2,2,2,3,4,5,5,5,5,5,5,5,5,5,5,5,5,6,7,7};
        newarray(a);
    }
    public static void newarray(int[] array){
        int[] count = new int[100];
        for(int i = 0; i < array.length; i++){
            count[array[i]]++;
        }
        int maxcount = count[0];
        int maxnumber = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] > maxcount){
                maxcount = count[i];
            }
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] == maxcount){
                maxnumber = i;
            }
        }

        System.out.println("最多出现的数字是：" + maxnumber );
        System.out.println("出现的次数是： " + maxcount);


    }

}
