import java.util.Scanner;

public class SecondAnswer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        if (name.equals("Вячеслав")){
            System.out.print("Привет,Вячеслав");
        }
        else
        {
            System.out.print("Нет,такого имени");
        }
    }
}
