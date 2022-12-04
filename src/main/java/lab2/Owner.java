package lab2;

import java.util.Objects;

public class Owner extends  Human{
    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public static class Builder{
        private Owner owner;
        public Builder(){
            owner = new Owner();
        }
        public Builder setName(String name){
            owner.name = name;
            return this;
        }
        public Builder setAddress(String address){
            owner.address = address;
            return this;
        }
        public Builder setAge(int age){
            owner.age = age;
            return this;
        }
        public Owner build(){
            return owner;
        }
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return age == owner.age && name.equals(owner.name) && address.equals(owner.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, age);
    }

}
