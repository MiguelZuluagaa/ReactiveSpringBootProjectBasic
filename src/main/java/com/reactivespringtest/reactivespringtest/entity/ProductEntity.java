package com.reactivespringtest.reactivespringtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
public class ProductEntity {
    @Id
    private String id;
    private String name;
    private int quantity;
    private double price;
}
