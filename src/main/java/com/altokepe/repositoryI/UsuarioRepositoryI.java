package com.altokepe.repositoryI;



import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altokepe.repository.Usuario;

@Repository
public interface UsuarioRepositoryI extends CrudRepository<Usuario, Integer> {

	@Procedure(name="listar_usuarios")
	public String listarUsuario(
			@Param("in_idusuario") int idusuario
			);
	
	@Procedure(name="listar_usuarios_nombre")
	public String buscarUsuarioNombre(
			@Param("in_nombre") String nombres
			);
	
	@Procedure(name="listar_usuarios_telefono")
	public String buscarUsuarioTelefono(
			@Param("in_celular") String celular
			);
	
	
	@Procedure(name="insertar_usuario")
	public String insertar_usuario(
			@Param("in_nombres") String nombres,
			@Param("in_apellidos") String apellidos,
			@Param("in_dni") String dni,
			@Param("in_celular") String celular,
			@Param("in_correo") String correo,
			@Param("in_contrasenia") String contrasenia
	
			);
	
	
	@Procedure(name="actualizar_usuario")
	public String actualizar_usuario(
			@Param("in_idusuario") int idusuario,
			@Param("in_nombres") String nombres,
			@Param("in_apellidos") String apellidos,
			@Param("in_dni") String dni,
			@Param("in_celular") String celular,
			@Param("in_correo") String correo,
			@Param("in_dinero") Double dinero,
			@Param("in_imagen") String imagen

			);
	
	@Procedure(name="actualizar_usuario_contrasenia")
	public String actualizar_usuario_contrasenia(
			@Param("in_idusuario") int idusuario,
			@Param("in_contrasenia") String contrasenia
			);
	
	@Procedure(name="recuperar_usuario_contrasenia")
	public String recuperar_usuario_contrasenia(
			@Param("in_idusuario") int idusuario,
			@Param("in_celular") String celular
			);
	
}
