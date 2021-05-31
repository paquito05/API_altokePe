package com.altokepe.repositoryI;

import java.util.Date;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altokepe.repository.Menu;

@Repository
public interface MenuRepositoryI extends CrudRepository<Menu, Integer> {

	@Procedure(name="listar_menu")
	public String listarMenu(
			@Param("in_idmenu") int idmenu
			);
	
	@Procedure(name="insertar_menu")
	public String insertarMenu(
			@Param("in_nombre") String nombre,
			@Param("in_descripcion") String descripcion,
			@Param("in_precio") double precio,
			@Param("in_imagen") String imagen,
			@Param("in_fechamenu") Date fechamenu
			);
	
	@Procedure(name="actualizar_menu")
	public String actualizarMenu(
			@Param("in_idmenu") int idmenu,
			@Param("in_nombre") String nombre,
			@Param("in_descripcion") String descripcion,
			@Param("in_precio") double precio,
			@Param("in_imagen") String imagen,
			@Param("in_fechamenu") Date fechamenu
			);
	
	@Procedure(name="eliminar_menu")
	public String eliminarMenu(
			@Param("in_idmenu") int idproducto
			);
	
	@Procedure(name="obtener_idproducto")
	public String obtenerIdMenu(
			@Param("in_idusuario") int idusuario
			);
}
