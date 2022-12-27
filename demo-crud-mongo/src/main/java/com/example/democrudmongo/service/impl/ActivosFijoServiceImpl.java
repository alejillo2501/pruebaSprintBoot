package com.example.democrudmongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.democrudmongo.commons.GenericServiceImpl;
import com.example.democrudmongo.dao.api.ActivosFijosRepository;
import com.example.democrudmongo.model.ActivosFijos;
import com.example.democrudmongo.service.api.ActivosFijosServiceApi;

@Service
public class ActivosFijoServiceImpl extends GenericServiceImpl<ActivosFijos, Long> implements ActivosFijosServiceApi {
	
	@Autowired
	private ActivosFijosRepository activosFijosRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public CrudRepository<ActivosFijos, Long> getDao(){
		return activosFijosRepository;
	}		
	
	public List<ActivosFijos> getByCity(String filtro, String valor){
		
		Query query = new Query();
		query.addCriteria(Criteria.where(filtro).is(valor));
		return mongoTemplate.find(query, ActivosFijos.class);
	}
	
}
