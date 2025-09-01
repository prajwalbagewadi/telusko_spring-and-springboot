package com.prajwal.simpleWebApp.Service;

import com.prajwal.simpleWebApp.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service //marks a class as serviceLayer bean
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"Bread",50.00), //error Expected no arguments but found 3
            new Product(102,"Eggs",45.00),
            new Product(103,"Jam",20.00)
    );

    public List<Product> getProducts(){

        return products;
    }

    public Product getProductById(int prodId) {
        //streamapi used for find by prodId or we can use a normal for loop.
        //return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().orElse(new Product(100,"no item",0.00)) ; //orElse for anyId eg(105)that doesnt exist in list will send dummy value or data
    }
}
