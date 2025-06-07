package com.vendepunto.api.persistence.crud;

import com.vendepunto.api.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {

}
