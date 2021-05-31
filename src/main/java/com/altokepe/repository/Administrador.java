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
@Table(name="administrador")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "validar_login", procedureName = "f_validar_login_admin", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_email", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_contrasenia", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "listar_administrador", procedureName = "f_listar_administrador", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "insertar_administrador", procedureName = "f_insertar_administrador", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_contrasenia", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ocupacion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "actualizar_administrador", procedureName = "f_actualizar_administrador", parameters = {
		
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idadministrador", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ocupacion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "eliminar_administrador", procedureName = "f_eliminar_administrador", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idadministrador", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "buscar_administrador_nombre", procedureName = "f_buscar_administrador_nombre", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})
public class Administrador {

	@Id
	@Column(name="idadministrador")
	private int idadministrador;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="contrasenia")
	private String contrasenia;
	
	@Column(name="celular")
	private String celular;
	
	@Column(name="estado")
	private int estado;
	
	@Column(name="dni")
	private String dni;
	
	@Column(name="ocupacion")
	private String ocupacion;

	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrador(int idadministrador, String nombres, String apellidos, String correo, String contrasenia,
			String celular, int estado, String dni, String ocupacion) {
		super();
		this.idadministrador = idadministrador;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.celular = celular;
		this.estado = estado;
		this.dni = dni;
		this.ocupacion = ocupacion;
	}

	public int getIdadministrador() {
		return idadministrador;
	}

	public void setIdadministrador(int idadministrador) {
		this.idadministrador = idadministrador;
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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
}
