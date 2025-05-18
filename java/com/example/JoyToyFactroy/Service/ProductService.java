package com.example.JoyToyFactroy.Service;

import com.example.JoyToyFactroy.Model.Product;
import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
}
