package Reto2;

import Reto2.Interface.OrderInterface;
import Reto2.Interface.SupplementsInterface;
import Reto2.Interface.UserInterface;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto2Application implements CommandLineRunner
{
    @Autowired
    private SupplementsInterface SuppCrudRepository;
    @Autowired
    private UserInterface userCrudRepository;
    @Autowired
    private OrderInterface orderCrudRepository;
	public static void main(String[] args)
        {
		SpringApplication.run(Reto2Application.class, args);
	}

        public void run(String... args) throws Exception 
        {
            SuppCrudRepository.deleteAll();
            userCrudRepository.deleteAll();
            orderCrudRepository.deleteAll();
        }
        
}
