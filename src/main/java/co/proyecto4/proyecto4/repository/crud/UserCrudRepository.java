package co.proyecto4.proyecto4.repository.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.proyecto4.proyecto4.model.User;

public interface UserCrudRepository extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
        //Reto 5
    List<User> findByMonthBirthtDay(String monthBirthtDay);

    //Para seleccionar el usuario con el id maximo
    //Corresponde a esta consulta de mongodb: db.usuarios.find().limit(1).sort({$natural:-1})
    Optional<User> findTopByOrderByIdDesc();
}
