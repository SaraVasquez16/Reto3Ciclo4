package com.cuatroa.Reto4.repository.crud;

import com.cuatroa.Reto4.model.Fragance;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author User
 */
public interface FraganceCrudRepository extends MongoRepository<Fragance, String> {
    //Retorna los productos en cuya descripición este digitada cierta palabra
    //Coincidencia de patrones en consultas = $regex y se puede usar con $options, la i = no es sensible a mayúsculas
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    List<Fragance> findByWordinDescription(String description);

    @Query("{price:?0}")
    public List<Fragance> getProductosByPrecio(Long precio);
}
