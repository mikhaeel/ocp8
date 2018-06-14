package info.everybodylies.ocp8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User  implements Comparable<User> {
    private static int i = 0;
    private final int id = i++;
    private String name;
    private List<String> roles = new ArrayList<>();
    private List<Double> doubles = new ArrayList<>();
    private long longId = i;

    public User(String name) {
        this.name = name;
        roles.add("role 1");
        roles.add("role 2");
        doubles.add(1.11);
        doubles.add(2.22);
        doubles.add(3.33);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getRoles() {
        return roles;
    }

    public List<Double> getDoubles() {
        return doubles;
    }

    public long getLongId() {
        return longId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roles=" + roles +
                ", doubles=" + doubles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(User o) {
        System.out.println("Invoke comparator...");
        if (this.getId() > o.getId()) {
            return 1;
        } else if (this.getId() < o.getId()) {
            return -1;
        }
        return 0;
    }
}
