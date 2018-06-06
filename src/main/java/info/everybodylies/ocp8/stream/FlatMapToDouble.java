package info.everybodylies.ocp8.stream;

public class FlatMapToDouble {

    public static void main(String[] args) {
        System.out.println("get double list from each user: ");
        UserStreamBuilder.getSmallUserStream()
                .flatMapToDouble(u -> u.getDoubles().stream().mapToDouble(Double::doubleValue))
                .forEach(System.out::println);
    }
}
