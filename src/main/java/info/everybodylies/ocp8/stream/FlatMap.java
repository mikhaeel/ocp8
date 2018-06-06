package info.everybodylies.ocp8.stream;

public class FlatMap {

    public static void main(String[] args) {
        System.out.println("Convert User to list of roles: ");
        UserStreamBuilder.getSmallUserStream().flatMap(u -> u.getRoles().stream()).forEach(System.out::println);
    }
}
