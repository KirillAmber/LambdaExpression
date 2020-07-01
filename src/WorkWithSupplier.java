import java.util.Random;
import java.util.function.Supplier;

public class WorkWithSupplier {
    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> {
            Random random = new Random();
            return random.nextInt(11);
        };
        System.out.println(randomSupplier.get());
    }
}
