package com.prajwal.simpleWebApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Data //will give you lombok functionality
/*
Specifically, @Data generates for your class:
@Getter → generates getters for all fields.
@Setter → generates setters for all non-final fields.
@ToString → generates a toString() method including all fields.
@EqualsAndHashCode → generates equals() and hashCode() methods.
@RequiredArgsConstructor → generates a constructor for final fields and fields marked with @NonNull.
*/
@AllArgsConstructor //creates a constructor will all property args
@Component //convert to class to bean
@Entity // for the class whos table you want to create
public class Product {

    @Id //denotes the primary key of the table
    private int prodId;
    private String prodName;
    private double prodPrice;

    //add default constructor to sol error:Parameter 0 of constructor in com.prajwal.simpleWebApp.Model.Product required a bean of type 'int' that could not be found.
    public Product(){

    }


//    public Product(int prodId, String prodName, double prodPrice) {
//        this.prodId = prodId;
//        this.prodName = prodName;
//        this.prodPrice = prodPrice;
//    }
//
    public int getProdId() {
        return prodId;
    }
//
//    public void setProdId(int prodId) {
//        this.prodId = prodId;
//    }
//
//    public String getProdName() {
//        return prodName;
//    }
//
//    public void setProdName(String prodName) {
//        this.prodName = prodName;
//    }
//
//    public double getProdPrice() {
//        return prodPrice;
//    }
//
//    public void setProdPrice(double prodPrice) {
//        this.prodPrice = prodPrice;
//    }

    //to view object from hashcode to human readable format.
    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }
}
