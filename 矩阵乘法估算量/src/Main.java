import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int numberOfMatrix = sc.nextInt();
            int[][] matrixContainer = new int[numberOfMatrix][2];
            for(int i = 0; i < numberOfMatrix; i++){
                matrixContainer[i][0] = sc.nextInt();
                matrixContainer[i][1] = sc.nextInt();
            }
            String multiplicationExpression = sc.next();
            Stack<Integer> stack = new Stack<>();
            int counter = 0;
            for(int i = 0; i < multiplicationExpression.length(); i++){
                if(multiplicationExpression.charAt(i) != ')'){
                    stack.push(multiplicationExpression.charAt(i) - 65);
                }
                else{
                        if(stack.size() >= 2){
                            int n1 = stack.pop();
                            int n2 = stack.pop();
                            int total = matrixContainer[n2][0] * matrixContainer[n2][1] * matrixContainer[n1][1];
                            counter = counter + total;
                            matrixContainer[n2][0] = matrixContainer[n2][0];
                            matrixContainer[n2][1] = matrixContainer[n1][1];
                            while(!stack.isEmpty() && stack.peek() == -25){
                                stack.pop();
                            }
                            stack.push(n2);
                        }
                        else{
                            break;
                        }
                }
            }
            System.out.println(counter);
        }
    }
}
