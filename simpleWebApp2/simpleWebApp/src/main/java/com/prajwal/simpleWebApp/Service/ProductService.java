package com.prajwal.simpleWebApp.Service;

import com.prajwal.simpleWebApp.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service //marks a class as serviceLayer bean
public class ProductService {

//    List<Product> products = Arrays.asList(
//            new Product(101,"Bread",50.00), //error Expected no arguments but found 3
//            new Product(102,"Eggs",45.00),
//            new Product(103,"Jam",20.00)
//    );

    //modified to arraylist to convert from immutable to mutable sol error:AbstractList.add()
    List<Product> products = new ArrayList<Product>(
            Arrays.asList(
                    new Product(101,"Britannia Fruit Bread",25.00),
                    new Product(102,"Vijay White Eggs",49.00),
                    new Product(103,"Kissan Mixed Fruit Jam",90.00),
                    new Product(104,"Kissan Fresh Tomato Ketchup",100.00)
            )
    );

    public List<Product> getProducts(){

        return products;
    }

    public Product getProductById(int prodId) {
        //streamapi used for find by prodId or we can use a normal for loop.
        //return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().orElse(new Product(100,"no item",0.00)) ; //orElse for anyId eg(105)that doesnt exist in list will send dummy value or data
    }

//    public void addProduct(Product prod){
//        //to view data send from client.
//        System.out.println("prod="+prod);
//        products.add(prod);
//    }
    public boolean addProduct(Product prod){
        //to view data send from client.
        System.out.println("prod="+prod);
        //boolean var and return type is added to check if data is added to list.
        boolean isadded=products.add(prod);
        return isadded;
    }

    public boolean updateProduct(Product prod) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId() == prod.getProdId()){
                index=i;
            }
        }
        //IndexOutofBoundsException if the index's are exausted. return for successful or failure.
        try{
            products.set(index,prod);
            return true;//success
        }catch(IndexOutOfBoundsException e){
            // Handle error, e.g., index is out of bounds
            return false;//failure
        }
    }

    public boolean deleteProduct(int prodId) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prodId){
                index=i;
            }
        }
        //IndexOutofBoundsException if the index's are exausted. return for successful or failure.
        try{
            products.remove(index);
            return true;//success
        }catch(IndexOutOfBoundsException e){
            // Handle error, e.g., index is out of bounds
            return false;//failure
        }

    }
}
