package com.test.businessservice;

import com.test.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by salonivithalani on 4/3/16.
 */
public class ProductService {
    public List<String> getProductCategories() {
        List<String> categories = new ArrayList<String>();
        categories.add("Books");
        categories.add("Movies");
        categories.add("Music");
        return categories;
    }

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Harry Potter", "Some sku", 500.00));
        products.add(new Product("Harry Potter 1", "Some sku", 550.00));
        products.add(new Product("Harry Potter 2", "Some sku", 560.00));
        products.add(new Product("Harry Potter 3", "Some sku", 530.00));
        products.add(new Product("Harry Potter 5", "Some sku", 450.00));

        return products;
    }
}
