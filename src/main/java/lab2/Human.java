package lab2;

import java.util.Objects;

public class Human {
    private String name;
    private String address;
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public static class Builder{
        private Human human;
        public Builder(){
            human = new Human();
        }
        public Builder setName(String name){
            human.name = name;
            return this;
        }
        public Builder setAddress(String address){
            human.address = address;
            return this;
        }
        public Human build(){
            return human;
        }
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) && address.equals(human.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
