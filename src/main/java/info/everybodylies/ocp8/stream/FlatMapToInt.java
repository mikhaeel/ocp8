package info.everybodylies.ocp8.stream;

public class FlatMapToInt {

    public static void main(String[] args) {
        System.out.println("get int list from each user: ");
        UserStreamBuilder.getSmallUserStream()
                .flatMapToInt(u -> u.getDoubles().stream().mapToInt(Double::intValue))
                .forEach(System.out::println);
    }

}
