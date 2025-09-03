package com.prajwal.simpleWebApp.Controller;

import com.prajwal.simpleWebApp.Model.Product;
import com.prajwal.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    //read
    //@RequestMapping("/products") //default get method mapping annotation
    @GetMapping("/products") //specialized get method mapping annotation
    public List<Product> getProducts(){
        return service.getProducts();
    }

    //@RequestMapping("/products/{prodId}")
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    //@RequestMapping("/products")
//    @PostMapping("/products") //specialized post method mapping annotation
//    //Error:prod=Product(prodId=0, prodName=null, prodPrice=0.0) data not getting received to server
//    //sol : @RequestBody to match send Body(data) to argument prod.
//    public void addProduct(@RequestBody Product prod){
//        service.addProduct(prod);
//    }

    //create
    //added Response on product successfully added to list
    @PostMapping("/products") //specialized post method mapping annotation
    //Error:prod=Product(prodId=0, prodName=null, prodPrice=0.0) data not getting received to server
    //sol : @RequestBody to match send Body(data) to argument prod.
    public String addProduct(@RequestBody Product prod){
        boolean isadded=service.addProduct(prod);
        return "Product added successfully:"+isadded;
    }

    //update
//    @PutMapping("/products") //specialized put method mapping annotation
//    public void updateProduct(@RequestBody Product prod){
//        service.updateProduct(prod);
//    }

    //update
    @PutMapping("/products") //specialized put method mapping annotation
    public String updateProduct(@RequestBody Product prod){
        boolean isupdated=service.updateProduct(prod);
        return "Product update successfully:"+isupdated;
    }
}
