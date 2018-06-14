package info.everybodylies.ocp8.stream;

public class NoneMatch {
    public static void main(String[] args) {
        System.out.println(UserStreamBuilder.getUserStream(5).noneMatch(u -> u.getId() > 20));
        System.out.println(UserStreamBuilder.getUserStream(5).noneMatch(u -> u.getId() < 20));
    }
}
