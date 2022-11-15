package com.toto.spanishtrainer.repositories;

import com.toto.spanishtrainer.persistenceModel.Substantive;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SubstantiveRepository extends MongoRepository<Substantive, UUID> {
    //
}
