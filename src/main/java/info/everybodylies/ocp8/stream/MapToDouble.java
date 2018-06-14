package info.everybodylies.ocp8.stream;

public class MapToDouble {
    public static void main(String[] args) {
        UserStreamBuilder.getUserStream(5)
                .mapToDouble(u -> u.getDoubles().get(0))
                .forEach(System.out::println);
    }
}
