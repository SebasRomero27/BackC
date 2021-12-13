package Reto2.Interface;

import Reto2.Model.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplementsInterface extends MongoRepository<Supplements, String>
{
   
}
