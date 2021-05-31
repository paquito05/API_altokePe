package com.altokepe.repository;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name ="menu")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "listar_menu", procedureName = "f_listar_menu", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmenu", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "insertar_menu", procedureName = "f_insertar_menu", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_precio", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_imagen", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fechamenu", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "actualizar_menu", procedureName = "f_actualizar_menu", parameters = {
		
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmenu", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_precio", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_imagen", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fechamenu", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "eliminar_menu", procedureName = "f_eliminar_menu", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmenu", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "obtener_idmenu", procedureName = "f_obtener_idmenu", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
})
public class Menu {

	@Id
	@Column(name="idmenu")
	private int idproducto;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="descripcion")
	private String descripcion;

	@Column(name="precio")
	private double precio;
	
	@Column(name="imagen")
	private String imagen;

	@Column(name="fechamenu")
	private Date fechamenu;
	
	@Column(name="estado")
	private int estado;
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(int idproducto, String nombre, String descripcion, double precio, String imagen, Date fechamenu,
			int estado) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.imagen = imagen;
		this.fechamenu = fechamenu;
		this.estado = estado;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Date getFechamenu() {
		return fechamenu;
	}

	public void setFechamenu(Date fechamenu) {
		this.fechamenu = fechamenu;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}



	
	
	
	

	
	
}
