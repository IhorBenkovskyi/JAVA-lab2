package lab2;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static class Builder{
        private Product product;
        public Builder(){
            product = new Product();
        }
        public Builder setName(String name){
            product.name = name;
            return this;
        }
        public Builder setPrice(double price){
            product.price = price;
            return this;
        }
        public Builder setQuantity(int quantity){
            product.quantity = quantity;
            return this;
        }
        public Product build(){
            return product;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && quantity == product.quantity && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }
}
