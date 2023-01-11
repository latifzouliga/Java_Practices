package randomPackage.GoogleStuff;

import java.util.stream.Stream;

public class Stream_API {

    public static void main(String[] args) {

        // using lambda
        // stream.forEach( s-> System.out.println(s));

        // using double colon
        // (ClassName::methodName)
        // SomeClass::someStaticMethod
        // <Class name>::<method name>

        Stream<String> stream
                = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer",
                "Portal");

        // Print the stream
        stream.forEach(a -> System.out.println(a));

        Stream<Integer> integers = Stream.of(1,2,3,4,5,6,7,7,8);

        integers.forEach(System.out::println);



    }
}
