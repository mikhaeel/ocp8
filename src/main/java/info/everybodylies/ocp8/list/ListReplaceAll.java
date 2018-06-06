package info.everybodylies.ocp8.list;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * Преобразование списка строк в новую строку в которой все символы приведены к верхнему регистру
 */
public class ListReplaceAll {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("j", "a", "v", "a");
        UnaryOperatorMethod(strings).forEach(System.out::print);
        foreachMethod(strings);
        joiningMethod(strings);
    }

    private static void joiningMethod(List<String> strings) {
        System.out.println("\nJoining method");
        System.out.println(strings.stream().collect(Collectors.joining()).toUpperCase());
    }

    private static void foreachMethod(List<String> strings) {
        System.out.println("\nforEach method");
        strings.forEach(string -> System.out.print(string.toUpperCase()));
    }

    private static List<String> UnaryOperatorMethod(List<String> strings) {
        System.out.println("UnariOperator method");
        UnaryOperator<String> operator = String::toUpperCase;
        strings.replaceAll(operator);
        return strings;
    }
}
