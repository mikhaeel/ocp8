package info.everybodylies.ocp8.stream;

import java.util.Random;
import java.util.stream.Stream;

public class UserStreamBuilder {

    public static Stream<User> getUserStream(int count) {
        Stream.Builder<User> sb = Stream.builder();
        Random r = new Random();
        for(int i = 0; i < count; i++) {
            sb.add(new User(String.valueOf(r.nextInt())));
        }
        return sb.build();
    }

    public static Stream<User> getSmallUserStream() {
        return getUserStream(new Random().nextInt(10) + 1);
    }
}
