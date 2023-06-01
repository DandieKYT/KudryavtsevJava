import java.util.Scanner;

public class FirstAnswer {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();

        if(a>7){
            System.out.print("Привет");
        }
        else{
            System.out.print("Введите другое число");
        }
    }
}
