package ss12;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private int id;
    private String name;

    public Product() {
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
    @Override
    public boolean equals(Object o) {
        Product product = (Product) o;
        return id == product.id && product.getName().equals(this.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.id==o.id){
            return this.getName().compareTo(o.getName());
        }
        return  this.id-o.id;

    }
}
