package Reto2.Repository;

import Reto2.Interface.OrderInterface;
import Reto2.Model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class OrderRepository
{
    @Autowired
    private OrderInterface orderCrudRepository;

    public List<Order> getAll()
    {
        return (List<Order>) orderCrudRepository.findAll();
    }

    public Optional<Order> getOrder(int id)
    {
        return orderCrudRepository.findById(id);
    }

    public Order create(Order order)
    {
        return orderCrudRepository.save(order);
    }

    public void update(Order order) 
    {
        orderCrudRepository.save(order);
    }

    public void delete(Order order) 
    {
        orderCrudRepository.delete(order);
    }
    
    public Optional<Order> lastUserId()
    {
        return orderCrudRepository.findTopByOrderByIdDesc();
    }
    
    public List<Order> findByZone (String zone)
    {
        return orderCrudRepository.findByZone(zone);
    }
}
