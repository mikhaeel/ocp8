package info.everybodylies.ocp8.stream;

public class ForEach
{

    public static void main(String[] args) {
        UserStreamBuilder.getSmallUserStream().parallel().forEach(u -> System.out.println("Печать данных пользователя: " + u));
    }
}
