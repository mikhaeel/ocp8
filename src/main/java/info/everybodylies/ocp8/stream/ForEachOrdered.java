package info.everybodylies.ocp8.stream;

public class ForEachOrdered {

    public static void main(String[] args) {
        UserStreamBuilder.getSmallUserStream().forEachOrdered(System.out::println);
    }
}
