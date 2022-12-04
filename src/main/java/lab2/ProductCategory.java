package lab2;

import java.util.Arrays;
import java.util.Objects;

public class ProductCategory {
    private String name;
    private String description;
    private Product[] products;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Product[] getProducts() {
        return products;
    }

    public static class Builder{
        private ProductCategory productCategory;
        public Builder(){
            productCategory = new ProductCategory();
        }
        public Builder setName(String name){
            productCategory.name = name;
            return this;
        }
        public Builder setDescription(String description){
            productCategory.description = description;
            return this;
        }
        public Builder setProducts(Product[] products){
            productCategory.products = products;
            return this;
        }
        public ProductCategory build(){
            return productCategory;
        }
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategory that = (ProductCategory) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Arrays.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, description);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }
}
