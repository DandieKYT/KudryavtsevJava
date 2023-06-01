import java.util.Arrays;

public class ThirdAnswer {

    public static void main(String[] args) {
        int[] numbers  = {3, 4, 6, 7, 9};
        numbers = Arrays.stream(numbers).filter(i -> i  % 3 == 0).toArray();
        System.out.println(Arrays.toString(numbers));

    }
}


