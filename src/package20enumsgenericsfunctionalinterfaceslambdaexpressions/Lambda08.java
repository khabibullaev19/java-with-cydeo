package package20enumsgenericsfunctionalinterfaceslambdaexpressions;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class Lambda08 {

    public static void main(String[] args) throws IOException {

        /*How to work with Files in Lambda*/

        // How to read a file by using Lambda
        Files.lines(Paths.get("src/package20enumsgenericsfunctionalinterfaceslambdaexpressions/text.txt"))
                .forEach(t -> System.out.print(t + " "));

        System.out.println();

        // Convert all characters to upper case then read it.
        Files.lines(Paths.get("src/package20enumsgenericsfunctionalinterfaceslambdaexpressions/text.txt"))
                .map(String::toUpperCase)
                .forEach(t -> System.out.print(t + " "));

        System.out.println();

        // Check if the text contain the word "Lambda"
        boolean hasLambda = Files.lines(Paths.get("src/package20enumsgenericsfunctionalinterfaceslambdaexpressions/text.txt"))
                .anyMatch(t -> t.contains("Lambda"));
        System.out.println(hasLambda);

        // Print all distinct word in the text on the console
        Files.lines(Paths.get("src/package20enumsgenericsfunctionalinterfaceslambdaexpressions/text.txt"))
                .map(t-> t.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(t -> System.out.print(t + " "));

        System.out.println();

        // Print all words which contains "e" in the text on the console
        Files.lines(Paths.get("src/package20enumsgenericsfunctionalinterfaceslambdaexpressions/text.txt"))
                .map(t -> t.split(" "))
                .flatMap(Arrays::stream)
                .map(t -> t.replace(",",""))
                .map(t -> t.replace(".",""))
                .filter(t -> t.contains("e"))
                .forEach(t -> System.out.print(t + " "));

        System.out.println();

        // Print the number of letters in the text
        int numberOfLetters = Files.lines(Paths.get("src/package20enumsgenericsfunctionalinterfaceslambdaexpressions/text.txt"))
                .map(t -> t.split(" "))
                .flatMap(Arrays::stream)
                .map(t -> t.replace(",",""))
                .map(t -> t.replace(".",""))
                .map(t -> t.replace(" ",""))
                .map(t-> t.length())
                .reduce(0,(t,u) -> t + u);
        System.out.println(numberOfLetters);

        // Print the distinct words which are ending with a
        Files.lines(Paths.get("src/package20enumsgenericsfunctionalinterfaceslambdaexpressions/text.txt"))
                .map(t -> t.split(" "))
                .flatMap(Arrays::stream)
                .map(t -> t.replace(",",""))
                .map(t -> t.replace(".",""))
                .filter(t -> t.endsWith("a"))
                .distinct()
                .forEach(t -> System.out.print(t + " "));

        System.out.println();


    }

}
