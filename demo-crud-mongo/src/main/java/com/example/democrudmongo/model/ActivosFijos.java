package com.example.democrudmongo.model;

import org.springframework.data.annotation.Id;
public class ActivosFijos {
	
	@Id
	private Long id;
	
	private String nombre;
	private String tipo;
	private String fechaBaja;
	private String fechaCompra;
	private String estadoActual;
	private String color;
	
	
	
	public ActivosFijos() {
		
	}
	public ActivosFijos(Long id, String nombre, String tipo, String fechaBaja, String fechaCompra, String estadoActual,
			String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.fechaBaja = fechaBaja;
		this.fechaCompra = fechaCompra;
		this.estadoActual = estadoActual;
		this.color = color;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public String getEstadoActual() {
		return estadoActual;
	}
	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
