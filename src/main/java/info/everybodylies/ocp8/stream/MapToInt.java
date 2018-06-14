package info.everybodylies.ocp8.stream;

public class MapToInt {
    public static void main(String[] args) {
        UserStreamBuilder.getUserStream(10)
                .mapToInt(User::getId)
                .forEach(System.out::println);
    }
}
