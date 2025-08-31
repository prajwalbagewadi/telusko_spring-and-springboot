package com.prajwal.simpleWebApp.Model;

import lombok.Data;

@Data //will give you lombok functionality
/*
Specifically, @Data generates for your class:
@Getter → generates getters for all fields.
@Setter → generates setters for all non-final fields.
@ToString → generates a toString() method including all fields.
@EqualsAndHashCode → generates equals() and hashCode() methods.
@RequiredArgsConstructor → generates a constructor for final fields and fields marked with @NonNull.
*/
public class Product {
    private int prodId;
    private String prodName;
    private double prodPrice;
}
