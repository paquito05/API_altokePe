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
@Table(name="movimientos")

@NamedStoredProcedureQueries(value  = {
		@NamedStoredProcedureQuery(name ="listar_movimientos_pedidos", procedureName = "f_listar_movimientos_pedidos", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name="in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name ="out_resultado",type =String.class) }),
		
		@NamedStoredProcedureQuery(name ="listar_movimientos_recargas", procedureName = "f_listar_movimientos_recargas", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name="in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name ="out_resultado",type =String.class) }),
		
		
		@NamedStoredProcedureQuery(name = "recargar_saldo", procedureName = "f_recargar_saldo", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_monto", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})


public class Movimientos {
	
	@Id
	@Column(name="idmovimiento")
	private int idmovimiento;
	
	@Column(name="monto")
	private Double monto;
	
	@Column(name="idusuario")
	private int idusuario;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="estado")
	private int estado;
	

	public Movimientos() {
		super();
	}

	public Movimientos(int idmovimiento, Double monto, int idusuario, String tipo, int estado) {
		super();
		this.idmovimiento = idmovimiento;
		this.monto = monto;
		this.idusuario = idusuario;
		this.tipo = tipo;
		this.estado = estado;
	}



	public int getIdmovimiento() {
		return idmovimiento;
	}

	public void setIdmovimiento(int idmovimiento) {
		this.idmovimiento = idmovimiento;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
