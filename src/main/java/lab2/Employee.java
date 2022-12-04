package lab2;

import java.util.Objects;

public class Employee extends Human{
    private String name;
    private String address;
    private int salary;
    private String position;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public static class Builder{
        private Employee employee;
        public Builder(){
            employee = new Employee();
        }
        public Builder setName(String name){
            employee.name = name;
            return this;
        }
        public Builder setAddress(String address){
            employee.address = address;
            return this;
        }
        public Builder setSalary(int salary){
            employee.salary = salary;
            return this;
        }
        public Builder setPosition(String position){
            employee.position = position;
            return this;
        }
        public Employee build(){
            return employee;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && name.equals(employee.name) && address.equals(employee.address) && position.equals(employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, salary, position);
    }
}
