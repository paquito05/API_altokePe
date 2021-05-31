package com.altokepe.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altokepe.repository.Usuario;
import com.altokepe.repositoryI.UsuarioRepositoryI;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepositoryI usuarioRepositoryI;


	public String listarUsuario(int idusuario) {
		return usuarioRepositoryI.listarUsuario(idusuario);
	}

	public String buscarUsuarioNombre(Usuario usuario) {
		return usuarioRepositoryI.buscarUsuarioNombre(usuario.getNombres());
	}

	public String buscarUsuarioTelefono(Usuario usuario) {
		return usuarioRepositoryI.buscarUsuarioTelefono(usuario.getCelular());
	}


	public String insertar_usuario(Usuario usuario) {
		return usuarioRepositoryI.insertar_usuario(
				usuario.getNombres(), 
				usuario.getApellidos(),
				usuario.getDni(),
				usuario.getCelular(),
				usuario.getCorreo(),
				usuario.getContrasenia()
				);
	}


	public String actualizar_usuario(Usuario usuario) {
		return usuarioRepositoryI.actualizar_usuario(
				usuario.getIdusuario(),
				usuario.getNombres(),
				usuario.getApellidos(),
				usuario.getDni(),
				usuario.getCelular(),
				usuario.getCorreo(),
				usuario.getDinero(),
				usuario.getImagen()

				);
		
	}	

	public String actualizar_usuario_contrasenia(Usuario usuario) {
			return usuarioRepositoryI.actualizar_usuario_contrasenia(
					usuario.getIdusuario(),
					usuario.getContrasenia()
					);
	}
	
	public String recuperar_usuario_contrasenia(Usuario usuario) {
		return usuarioRepositoryI.recuperar_usuario_contrasenia(
				usuario.getIdusuario(),
				usuario.getCelular()
				);
}

}

