/*
import java.util.Arrays;

public class Cart {
    private Customer customer;
    private Product[] products;

    public Cart(Customer customer){
        this.customer = customer;
        this.products = new Product[0];
    }
    public Cart(Customer customer, Product[] products){
        this.customer = customer;
        this.products = products;
    }
    public void addProduct(Product product){
        Product[] newProducts = new Product[this.products.length + 1];
        for (int i = 0; i < this.products.length ; i++) {
            newProducts[i] = this.products[i];
        }
        newProducts[this.products.length] = product;

        this.products = newProducts;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "customer=" + customer +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
*/
import java.util.Arrays;
public class Cart {
    private User  user;
    private Product[] products;
    public Cart(User user){

        this.user = user;
        this.products = new Product[0];
    }
    public Cart(User user, Product[] products){
        this.products = products;
        this.user = user;
    }

    public void printCart () {
        for (int i = 0; i < this.products.length; i++) {
            System.out.println(products[i]);
        }
    }

    public void addToCart (Product product){
        Product [] newProducts = new Product[this.products.length +1 ];
        for (int i = 0; i < this.products.length; i++) {
            newProducts[i] = this.products[i];
        }
        newProducts[newProducts.length-1] = product;
        this.products = newProducts;

    }

    public Product[] getProducts() {
        return products;
    }

    public User getUser() {
        return user;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    @Override
    public String toString() {
        return "Cart{" +
                "user=" + this.user +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}