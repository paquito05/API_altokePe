package com.altokepe.repositoryI;


import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altokepe.repository.Administrador;

@Repository
public interface AdministradorRepositoryI extends CrudRepository<Administrador, Integer> {

	@Procedure(name="validar_login")
	public String validarLogin(
			@Param("in_email") String email,
			@Param("in_contrasenia") String contrasenia
			);
	
	@Procedure(name="listar_administradores")
	public String listarAdministradores(
			@Param("in_idusuario") int idusuario
			);
	
	@Procedure(name="insertar_administrador")
	public String insertarAdministrador(
			@Param("in_nombres") String nombres,
			@Param("in_apellidos") String apellidos,
			@Param("in_correo") String correo,
			@Param("in_contrasenia") String contrasenia,
			@Param("in_celular") String celular,
			@Param("in_dni") String dni,
			@Param("in_ocupacion") String ocupacion
			);
	
	@Procedure(name="actualizar_administrador")
	public String actualizarAdministrador(
			@Param("in_idadministrador") int idadministrador,
			@Param("in_nombres") String nombres,
			@Param("in_apellidos") String apellidos,
			@Param("in_correo") String correo,
			@Param("in_celular") String celular,
			@Param("in_dni") String dni,
			@Param("in_ocupacion") String ocupacion
			);
	
	@Procedure(name="eliminar_administrador")
	public String eliminarAdministradores(
			@Param("in_idadministrador") int idadministrador
			);
	
	@Procedure(name="buscar_administrador_nombre")
	public String buscarPorNombre(
			@Param("in_nombre") String nombres
			);
}
