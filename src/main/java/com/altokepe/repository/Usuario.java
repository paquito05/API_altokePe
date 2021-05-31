package com.altokepe.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="usuario")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "listar_usuarios", procedureName = "f_listar_usuario", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "listar_usuarios_nombre", procedureName = "f_buscar_usuarios_nombre", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "listar_usuarios_telefono", procedureName = "f_buscar_usuarios_telefono", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "insertar_usuario", procedureName = "f_insertar_usuario", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_contrasenia", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "actualizar_usuario", procedureName = "f_actualizar_usuario", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dinero", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_imagen", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		
	@NamedStoredProcedureQuery(name = "actualizar_usuario_contrasenia", procedureName = "f_actualizar_usuario_contrasenia", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_contrasenia", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
	
	
	@NamedStoredProcedureQuery(name = "recuperar_usuario_contrasenia", procedureName = "f_recuperar_usuario_contrasenia", parameters = {
			
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class)}),
	
})
public class Usuario {
	
	@Id
	@Column(name="idusuario")
	private int idusuario;

	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="dni")
	private String dni;
	
	@Column(name="celular")
	private String celular;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="contrasenia")
	private String contrasenia;
	
	@Column(name="dinero")
	private Double dinero;
	
	@Column(name="imagen")
	private String imagen;

	@Column(name="estado")
	private int estado;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Usuario(int idusuario, String nombres, String apellidos, String dni, String celular, String correo,
			String contrasenia, Double dinero, String imagen, int estado) {
		super();
		this.idusuario = idusuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.celular = celular;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.dinero = dinero;
		this.imagen = imagen;
		this.estado = estado;
	}



	public int getIdusuario() {
		return idusuario;
	}



	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getContrasenia() {
		return contrasenia;
	}



	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



	public Double getDinero() {
		return dinero;
	}



	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}



	public String getImagen() {
		return imagen;
	}



	public void setImagen(String imagen) {
		this.imagen = imagen;
	}



	public int getEstado() {
		return estado;
	}



	public void setEstado(int estado) {
		this.estado = estado;
	}



	
}


