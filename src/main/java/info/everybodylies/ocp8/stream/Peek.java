package info.everybodylies.ocp8.stream;

public class Peek {
    public static void main(String[] args) {
        System.out.println(UserStreamBuilder.getUserStream(5)
                .peek(i -> System.out.println("peek value: " + i)).max(User::compareTo));
    }
}
