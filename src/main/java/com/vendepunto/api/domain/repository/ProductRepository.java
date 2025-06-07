package com.vendepunto.api.domain.repository;

import com.vendepunto.api.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();

    Optional<List<Product>> getByCategory(int categoryId);

    Optional<List<Product>> getScarseProducts(int quantity);

    Optional<Product> getProduct(int idProduct);

    Product saveProduct(Product product);

    void deleteProduct(int idProduct);
}
