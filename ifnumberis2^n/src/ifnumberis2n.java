public class ifnumberis2n {
    public static void main(String[] args) {
        int a = 8;
        if(a >0){
            //利用2的幂转换成二进制一定是1后面跟着一堆0，（8 to 1000），且该数字减1之后会是最高位数为0，其余位数为1，
            //所以如果这两个数字用&比较，会得出0.
            //&运算符在int或者long之间比较的时候，操作：Sets each bit to 1 if both bits are 1
            //|运算符在int或者long之间比较的时候，操作：Sets each bit to 1 if any of the two bits is 1
            if((a & (a-1)) == 0){
                System.out.println("yes");

            }
            else{
                System.out.println("no");
            }
        }
        else{
            System.out.println("input wrong");
        }
    }

}
