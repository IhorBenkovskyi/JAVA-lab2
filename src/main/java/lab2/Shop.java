package lab2;

import java.util.Arrays;
import java.util.Objects;

public class Shop {
    private String name;
    private String address;
    private Employee[] employees;
    private ProductCategory[] productCategories;

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Employee[] getEmployees() {
        return employees;
    }
    public ProductCategory[] getProductCategories() {
        return productCategories;
    }
    public static class Builder{
        private Shop shop;
        public Builder(){
            shop = new Shop();
        }
        public Builder setName(String name){
            shop.name = name;
            return this;
        }
        public Builder setAddress(String address){
            shop.address = address;
            return this;
        }
        public Builder setEmployees(Employee[] employees){
            shop.employees = employees;
            return this;
        }
        public Builder setProductCategories(ProductCategory[] productCategories){
            shop.productCategories = productCategories;
            return this;
        }
        public Shop build(){
            return shop;
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", productCategories=" + Arrays.toString(productCategories) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) &&
                Objects.equals(address, shop.address) &&
                Arrays.equals(employees, shop.employees) &&
                Arrays.equals(productCategories, shop.productCategories);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, address);
        result = 31 * result + Arrays.hashCode(employees);
        result = 31 * result + Arrays.hashCode(productCategories);
        return result;
    }

}
