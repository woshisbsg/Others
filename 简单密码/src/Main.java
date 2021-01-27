import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer newPassword = new StringBuffer();
        while(!sc.hasNext("@")){
            String password = sc.nextLine();
            for(int i = 0; i < password.length(); i++){
                if(password.charAt(i) >=65 && password.charAt(i) <=90 ){
                    if(password.charAt(i) == 'Z'){
                        newPassword.append("a");
                    }
                    else{
                        char temp = (char)(password.charAt(i) + 1 + 32);
                        newPassword.append(temp);
                    }
                }
                else if(password.charAt(i) >=97 && password.charAt(i) <=122){
                    if(password.charAt(i) == 'a' || password.charAt(i) == 'b' || password.charAt(i) == 'c'){
                        newPassword.append("2");
                    }
                    else if(password.charAt(i) == 'd' || password.charAt(i) == 'e' || password.charAt(i) == 'f'){
                        newPassword.append("3");
                    }
                    else if(password.charAt(i) == 'g' || password.charAt(i) == 'h' || password.charAt(i) == 'i'){
                        newPassword.append("4");
                    }
                    else if(password.charAt(i) == 'j' || password.charAt(i) == 'k' || password.charAt(i) == 'l'){
                        newPassword.append("5");
                    }
                    else if(password.charAt(i) == 'm' || password.charAt(i) == 'n' || password.charAt(i) == 'o'){
                        newPassword.append("6");
                    }
                    else if(password.charAt(i) == 'p' || password.charAt(i) == 'q' || password.charAt(i) == 'r' || password.charAt(i) == 's'){
                        newPassword.append("7");
                    }
                    else if(password.charAt(i) == 't' || password.charAt(i) == 'u' || password.charAt(i) == 'v'){
                        newPassword.append("8");
                    }else if(password.charAt(i) == 'w' || password.charAt(i) == 'x' || password.charAt(i) == 'y'|| password.charAt(i) == 'z'){
                        newPassword.append("9");
                    }
                }
                else if(password.charAt(i) >= 48 && password.charAt(i) <= 57){
                    newPassword.append(password.charAt(i));
                }
            }
            System.out.println(newPassword);

        }

    }
}
