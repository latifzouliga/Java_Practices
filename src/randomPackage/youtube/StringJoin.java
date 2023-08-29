package randomPackage.youtube;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoin {

    public static void main(String[] args) {

        List<String> list = List.of("Java", "programming", "language");

        String joinedString = String.join(" ",list);
        System.out.println(joinedString);                      // Java programming language

        var stringJoiner = new StringJoiner(", ", "{", "}");
        //list.forEach(e -> stringJoiner.add(e));
        list.forEach(stringJoiner::add);
        System.out.println(stringJoiner);                      // {Java, programming, language}

        String joined = list.stream()
                .collect(Collectors.joining(", ","|","|"));
        System.out.println(joined);                            // |Java, programming, language|


    }
}
