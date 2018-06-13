package info.everybodylies.ocp8.stream;

public class ForEachOrdered {

    public static void main(String[] args) {
        UserStreamBuilder.getSmallUserStream().parallel().forEachOrdered(System.out::println);
    }
}
