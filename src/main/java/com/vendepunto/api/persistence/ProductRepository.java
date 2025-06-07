package com.vendepunto.api.persistence;

import com.vendepunto.api.persistence.crud.ProductCrudRepository;
import com.vendepunto.api.persistence.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }



    public Optional<Product> getProduct(int idProduct){
        return productCrudRepository.findById(idProduct);
    }

    public Product saveProduct(Product product){
        return productCrudRepository.save(product);
    }

    public void deleteProduct(int idProduct){
        productCrudRepository.deleteById(idProduct);
    }
}
