package co.proyecto4.proyecto4.repository.crud;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.proyecto4.proyecto4.model.Fragance;
import org.springframework.data.mongodb.repository.Query;

public interface FraganceCrudRepository extends MongoRepository<Fragance, String>{
    public List<Fragance> findByPriceLessThanEqual(double precio);

    //Reto 5
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Fragance> findByDescriptionLike(String description);
    
}
