package Reto2.Model;

import java.util.Date;
import java.util.Map;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order 
{
public static String PENDING = "Pendiente";
public static String APROVED = "Aprobada";
public static String REJECTED = "Rechazada";
@Id
private Integer id;
private Date registerDay;
private String status;
private User salesMan;

private Map<String, Supplements> products;
private Map<String, Integer> quantities;
}
