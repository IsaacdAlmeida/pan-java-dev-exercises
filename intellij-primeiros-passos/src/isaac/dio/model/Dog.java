package isaac.dio.model;

import java.util.Objects;

public class Dog {
    private String name;
    private String race;
    private Integer Age;

    public Dog() {}

    public Dog(String name, String race, Integer age) {
        this.name = name;
        this.race = race;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(race, dog.race) && Objects.equals(Age, dog.Age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, race, Age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", Age=" + Age +
                '}';
    }
}
