import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int len = sc.nextInt();
            int[][] arr = new int[len][len];
            int counter = 1;
            int rowNumber = 0;
            int columnNumber = -0;
            int temp = 0;


                for(int j = 0; j < (len * (len + 1)) / 2; j++){
                    if(rowNumber == 0 && columnNumber == 0){
                        arr[rowNumber][columnNumber] = counter;
                        counter++;
                        rowNumber++;
                        continue;
                    }
                    if(rowNumber == -1){
                        rowNumber = columnNumber;
                        columnNumber = 0;
                        //temp = 1;
                        arr[rowNumber][columnNumber] = counter;
                        counter++;
                        rowNumber--;
                        columnNumber++;
                    }
                    else {
                        arr[rowNumber][columnNumber] = counter;
                        rowNumber--;
                        columnNumber++;
                        counter++;
                        //temp++;
                    }
                }

            for(int i = 0; i < len; i++){
                for(int j = 0; j < len; j++){
                    if(arr[i][j] != 0){
                        if(j == len - 1){
                            System.out.print(arr[i][j] + " ");
                            System.out.println("");
                            break;
                        }
                        else{
                            System.out.print(arr[i][j] + " ");
                        }
                    }
                    else{
                        System.out.println("");
                        break;
                    }
                }
            }


        }
    }
}
