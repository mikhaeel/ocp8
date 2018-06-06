package info.everybodylies.ocp8.stream;

public class FlatMapToLong {

    public static void main(String[] args) {
        System.out.println("get long list from each user: ");
        UserStreamBuilder.getSmallUserStream()
                .flatMapToLong(u -> u.getDoubles().stream().mapToLong(Double::longValue))
                .forEach(System.out::println);
    }
}
