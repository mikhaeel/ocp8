package info.everybodylies.ocp8.stream;

public class MapToLong {
    public static void main(String[] args) {
        UserStreamBuilder.getUserStream(5)
                .mapToLong(User::getLongId)
                .forEach(System.out::println);
    }
}
