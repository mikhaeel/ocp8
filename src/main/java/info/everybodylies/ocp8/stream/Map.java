package info.everybodylies.ocp8.stream;

public class Map {
    public static void main(String[] args) {
        UserStreamBuilder.getUserStream(5).map(u -> u.getId() + ":" + u.getName()).forEach(System.out::println);
    }
}
