package randomPackage.stream;

import java.util.Random;
import java.util.stream.Stream;

public class Generate {

    public static void main(String[] args) {

        // generate() method is a way to create an infinite stream of elements using a Supplier<T> function.
        Stream.generate(() -> new Random().nextInt(100))
                .filter(p -> p % 3 == 0)
                .limit(10)
                .forEach(System.out::println);

        // generate() method to create a stream of constant strings using a lambda expression:
        Stream<String> streamOfConstantStrings = Stream.generate(() -> "element");
        streamOfConstantStrings.limit(3)
                .forEach(System.out::println);


    }
}
