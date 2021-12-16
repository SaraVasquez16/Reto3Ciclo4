package com.cuatroa.retotres.repository;

import com.cuatroa.retotres.model.Fragance;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retotres.repository.crud.FraganceCrudRepository;

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
}
