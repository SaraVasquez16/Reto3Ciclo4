package com.cuatroa.Reto4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * 
 * @author User
 */
@Document(collection = "fragance")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fragance {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String presentation;
    private String description;
    private boolean availability = true;
    private Double price;
    private Integer quantity;
    private String photography;
}
