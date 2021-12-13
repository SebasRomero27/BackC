package Reto2.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "supplements")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplements
{
    @Id
    private String reference;
    private String brand;
    private String category;
    private String materiales;
    private String dimensiones;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
}