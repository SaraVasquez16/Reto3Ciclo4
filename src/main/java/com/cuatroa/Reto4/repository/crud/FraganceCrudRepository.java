package com.cuatroa.Reto4.repository.crud;

import com.cuatroa.Reto4.model.Fragance;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author User
 */
public interface FraganceCrudRepository extends MongoRepository<Fragance, String> {
    
}
