package com.example.democrudmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrudmongo.model.ActivosFijos;
import com.example.democrudmongo.model.FiltrosQuery;
import com.example.democrudmongo.service.api.ActivosFijosServiceApi;
import com.example.democrudmongo.service.impl.ActivosFijoServiceImpl;

@RestController
@RequestMapping("/ActivosFijos/api/v1")
@CrossOrigin("*")
public class ActivosFijosController {
	
	@Autowired
	private ActivosFijosServiceApi activosFijosAPI;
	
	@Autowired
	private ActivosFijoServiceImpl activosFijosImpl;
	
	@GetMapping(value="/all")
	public List<ActivosFijos> getAll(){
		return activosFijosAPI.getAll();
	}
	
	@GetMapping(value="/find/{id}")
	public ActivosFijos find(@PathVariable Long id) {
		return activosFijosAPI.get(id);
	}
	
	@PostMapping(value="/findObject")
	public List<ActivosFijos> findObject(@RequestBody FiltrosQuery filtros) {
		return activosFijosImpl.getByCity(filtros.getFiltro(), filtros.getValor());
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<ActivosFijos> save(@RequestBody ActivosFijos activosFijos){
		ActivosFijos obj = activosFijosAPI.save(activosFijos);
		return new ResponseEntity<ActivosFijos>(obj, HttpStatus.OK);
	}
	
	@GetMapping(value="/delete/{id}")
	public ResponseEntity<ActivosFijos> delete(@PathVariable Long id){
		ActivosFijos obj = activosFijosAPI.get(id);
		if(obj != null) {
			activosFijosAPI.delete(id);
		}else {
			return new ResponseEntity<ActivosFijos>(HttpStatus.valueOf(404));
		}
		
		return new ResponseEntity<ActivosFijos>(obj, HttpStatus.OK);
	}
}
