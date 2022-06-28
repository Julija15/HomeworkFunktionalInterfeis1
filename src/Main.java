import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        UnaryOperator<String> result = x -> new StringBuilder(x).reverse().toString();
        UnaryOperator<Integer> result1 = x -> {
            if (x <= 1) {
                return 1;
            } else {
                return IntStream.rangeClosed(2, x).reduce((a, b) -> a * b).getAsInt();
            }
        };
        if (n == 1) {
            System.out.println(result.apply("Sofija"));
        }
        if (n == 2) {
            System.out.println(result1.apply(5));
        }
    }
}
