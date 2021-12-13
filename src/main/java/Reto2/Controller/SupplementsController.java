package Reto2.Controller;

import Reto2.Model.Supplements;
import Reto2.Service.SupplementService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/api/cookware")
@CrossOrigin("*")
public class SupplementsController 
{
    @Autowired
    private SupplementService supplementService;
       
     @GetMapping("/all")
    public List<Supplements> getAll() {
        return supplementService.getAll();
    }
    
    @GetMapping("/{reference}")
    public Optional<Supplements> getSupplements(@PathVariable("reference") String reference)
    {
        return supplementService.getSupplement(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Supplements create(@RequestBody Supplements gadget)
    {
        return supplementService.create(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Supplements update(@RequestBody Supplements gadget)
    {
        return supplementService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference)
    {
        return supplementService.delete(reference);
    }
}
