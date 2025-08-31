package com.prajwal.simpleWebApp.Service;

import com.prajwal.simpleWebApp.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service //marks a class as serviceLayer bean
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"Bread",50.00),
            new Product(102,"Eggs",45.00),
            new Product(103,"Jam",20.00)
    );

    public List<Product> getProducts(){
        return products;
    }
}
