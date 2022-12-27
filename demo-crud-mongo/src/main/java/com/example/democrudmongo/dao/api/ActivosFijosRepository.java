package com.example.democrudmongo.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.democrudmongo.model.ActivosFijos;

public interface ActivosFijosRepository extends MongoRepository<ActivosFijos, Long> {

}
