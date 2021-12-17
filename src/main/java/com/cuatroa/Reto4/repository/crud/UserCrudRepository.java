package com.cuatroa.Reto4.repository.crud;

import com.cuatroa.Reto4.model.User;
import java.util.Optional;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author User
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);
    
    //Para seleccionar el usuario con el id maximo
    Optional<User> findTopByOrderByIdDesc();

    //Retorna los usuarios por mes de cumpleaños
    @Query("{monthBirthtDay:'?0'}")
    List<User> findByMonthBirthDay(String monthBirthtDay);
}
