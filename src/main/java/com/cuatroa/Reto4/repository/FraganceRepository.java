package com.cuatroa.Reto4.repository;

import com.cuatroa.Reto4.model.Fragance;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.Reto4.repository.crud.FraganceCrudRepository;

/**
 *
 * @author User
 */
@Repository
public class FraganceRepository {
    @Autowired
    private FraganceCrudRepository fraganceCrudRepository;

    public List<Fragance> getAll() {
        return fraganceCrudRepository.findAll();
    }

    public Optional<Fragance> getFragance(String reference) {
        return fraganceCrudRepository.findById(reference);
    }
    
    public Fragance save(Fragance fragance) {
        return fraganceCrudRepository.save(fragance);
    }

    public void update(Fragance fragance) {
        fraganceCrudRepository.save(fragance);
    }
    
    public void delete(Fragance fragance) {
        fraganceCrudRepository.delete(fragance);
    }

    //Métodos del reto 5      
    public List<Fragance> findByWordinDescription(String description) {
        return fraganceCrudRepository.findByWordinDescription(description);
    }

    public List<Fragance> getProductosByPrecio(Long precio) {
        return fraganceCrudRepository.getProductosByPrecio(precio);
    }
}
