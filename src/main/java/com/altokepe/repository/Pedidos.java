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
@Table(name ="pedidos")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "listar_pedidos", procedureName = "f_listar_pedidos", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idpedido", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "insertar_pedidos", procedureName = "f_insertar_pedidos", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_direccion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_cantidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fechapedido", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmenu", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "actualizar_pedidos", procedureName = "f_actualizar_pedidos", parameters = {
		
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idpedido", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_direccion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_cantidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fechapedido", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmenu", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "eliminar_pedidos", procedureName = "f_eliminar_pedidos", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idpedido", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "obtener_idpedidos", procedureName = "f_obtener_idpedidos", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "buscar_pedidos_fecha", procedureName = "f_buscar_pedidos_fecha", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fechapedido", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "buscar_pedidos_nombre", procedureName = "f_buscar_pedidos_nombre", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
})

public class Pedidos {

	@Id
	@Column(name="idpedido")
	private int idpedido;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="direccion")
	private String direccion;

	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="descripcion")
	private String descripcion;

	@Column(name="fechapedido")
	private Date fechapedido;
	
	@Column(name="idusuario")
	private int idusuario;
	
	@Column(name="idmenu")
	private int idmenu;
	
	@Column(name="estado")
	private int estado;

	public Pedidos() {
		super();
	}

	public Pedidos(int idpedido, String nombre, String direccion, int cantidad, String descripcion, Date fechapedido,
			int idusuario, int idmenu, int estado) {
		super();
		this.idpedido = idpedido;
		this.nombre = nombre;
		this.direccion = direccion;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.fechapedido = fechapedido;
		this.idusuario = idusuario;
		this.idmenu = idmenu;
		this.estado = estado;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechapedido() {
		return fechapedido;
	}

	public void setFechapedido(Date fechapedido) {
		this.fechapedido = fechapedido;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdmenu() {
		return idmenu;
	}

	public void setIdmenu(int idmenu) {
		this.idmenu = idmenu;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
	

}
