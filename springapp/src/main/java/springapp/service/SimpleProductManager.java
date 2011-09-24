package main.java.springapp.service;

import java.util.List;

import main.java.springapp.domain.Product;

public class SimpleProductManager implements ProductManager {

	private static final long serialVersionUID = -8496073722504327710L;

    private List<Product> products;
    
    public List<Product> getProducts() {
        return products;
    }

    public void increasePrice(int percentage) {
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }
    }
    
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
