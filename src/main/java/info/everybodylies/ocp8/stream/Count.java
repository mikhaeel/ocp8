package info.everybodylies.ocp8.stream;

import java.util.Random;

public class Count {

    public static void main(String[] args) {
        int count = new Random().nextInt(10);
        long userCount = UserStreamBuilder.getUserStream(count).count();
        System.out.println("count of User stream is " + userCount);
    }
}
