import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int[][] matrix1 = new int[x][y];
            int[][] matrix2 = new int[y][z];
            int[][] resultmatrix = new int[x][z];
            for(int i = 0; i < x; i++){
                for(int j = 0; j < y; j++){
                    matrix1[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < y; i++){
                for(int j = 0; j < z; j++){
                    matrix2[i][j] = sc.nextInt();
                }
            }
            resultmatrix = matrixMutilication(matrix1, matrix2);
            printMatrix(resultmatrix);

        }
    }

    public static void printMatrix(int[][] matrix1){
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[0].length; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMutilication(int[][] matrix1, int[][] matrix2){
        int x = matrix1.length;
        int y = matrix2.length;
        int z = matrix2[0].length;
        int[][] resultmatrix = new int[x][z];
        ArrayList<Integer> matrixFinalList = new ArrayList<>();

        for(int i = 0; i < x; i++){
            for(int j = 0; j < z; j++){
                for(int k = 0; k < y; k ++){
                    resultmatrix[i][j] = resultmatrix[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultmatrix;

    }
}
