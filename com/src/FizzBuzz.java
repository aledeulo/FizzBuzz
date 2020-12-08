import java.util.stream.IntStream;

/**
 * @author Alejandro Deulofeu
 */
public class FizzBuzz {
    private static final StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(index -> {
            if (index % 3 == 0 && index % 5 == 0) builder.append("FizzBuzz").append("\n");
            if (index % 5 == 0) builder.append("Buzz").append("\n");
            if (index % 3 == 0) builder.append("Fizz").append("\n");
        });
        System.out.println(builder.toString());
    }
}
