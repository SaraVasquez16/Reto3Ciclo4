package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.Fragance;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author User
 */
public interface FraganceCrudRepository extends MongoRepository<Fragance, String> {
    
}
