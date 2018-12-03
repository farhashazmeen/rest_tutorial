package io.codementor.gtommee.rest_tutorial.repositories;

import io.codementor.gtommee.rest_tutorial.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {
    User findBy_id(Integer _id);
    //User findBy(ObjectId id);
}
