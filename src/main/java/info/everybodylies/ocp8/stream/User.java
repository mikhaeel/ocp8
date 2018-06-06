package info.everybodylies.ocp8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.DoubleStream;

public class User {
    private String name;
    private List<String> roles = new ArrayList<>();
    private List<Double> doubles = new ArrayList<>();

    public User(String name) {
        this.name = name;
        roles.add("role 1");
        roles.add("role 2");
        doubles.add(1.11);
        doubles.add(2.22);
        doubles.add(3.33);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getRoles() {
        return roles;
    }

    public List<Double> getDoubles() {
        return doubles;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
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
}
