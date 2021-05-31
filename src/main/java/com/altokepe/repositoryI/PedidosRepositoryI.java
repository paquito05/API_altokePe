package com.altokepe.repositoryI;

import java.util.Date;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altokepe.repository.Pedidos;

@Repository
public interface PedidosRepositoryI extends CrudRepository<Pedidos, Integer>{

	@Procedure(name="listar_pedidos")
	public String listarPedidos(
			@Param("in_idpedido") int idpedido
			);
	
	@Procedure(name="insertar_pedidos")
	public String insertarPedidos(
			@Param("in_nombre") String nombre,
			@Param("in_direccion") String direccion,
			@Param("in_cantidad") int cantidad,
			@Param("in_descripcion") String descripcion,
			@Param("in_fechapedido") Date fechamenu,
			@Param("in_idusuario") int idusuario,
			@Param("in_idmenu") int idmenu
			
			);
	
	@Procedure(name="actualizar_pedidos")
	public String actualizarPedidos(
			@Param("in_idpedido") int idpedido,
			@Param("in_nombre") String nombre,
			@Param("in_direccion") String direccion,
			@Param("in_cantidad") int cantidad,
			@Param("in_descripcion") String descripcion,
			@Param("in_fechapedido") Date fechamenu,
			@Param("in_idusuario") int idusuario,
			@Param("in_idmenu") int idmenu
			
			);
	
	@Procedure(name="eliminar_pedidos")
	public String eliminarPedidos(
			@Param("in_idpedido") int idpedido
			);
	
	
	@Procedure(name="buscar_pedidos_fecha")
	public String buscarPedidosFecha(
			@Param("in_fechapedido") Date fechamenu
			);
	
	@Procedure(name="buscar_pedidos_nombre")
	public String buscarPedidosNombre(
			@Param("in_nombre") String nombre
			);
	
	
}
