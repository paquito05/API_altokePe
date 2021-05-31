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
@Table(name="empleado")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "listar_empleador", procedureName = "f_listar_empleados_admin", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "insertar_empleado", procedureName = "f_insertar_empleado", parameters = {
						
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ocupacion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_sueldo", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fechainicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fechafin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "actualizar_empleado", procedureName = "f_actualizar_empleado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idempleado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ocupacion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_sueldo", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fechainicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fechafin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "eliminar_empleado", procedureName = "f_eliminar_empleado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idempleado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "buscar_empleado_nombre", procedureName = "f_buscar_empleado_nombre", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		
})
public class Empleado {

	@Id
	@Column(name="idempleado")
	private int idempleado;
	
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
	
	@Column(name="ocupacion")
	private String ocupacion;
	
	@Column(name="sueldo")
	private Double  sueldo;
	
	@Column(name="fechainicio")
	private Date fechainicio;
	
	@Column(name="fechafin")
	private Date fechafin;
	
	@Column(name="estado")
	private int estado;

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(int idempleado, String nombres, String apellidos, String dni, String celular, String correo,
			String ocupacion, Double sueldo, Date fechainicio, Date fechafin, int estado) {
		super();
		this.idempleado = idempleado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.celular = celular;
		this.correo = correo;
		this.ocupacion = ocupacion;
		this.sueldo = sueldo;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.estado = estado;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
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

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Date getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Date getFechafin() {
		return fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}



	
	
	
	
}

