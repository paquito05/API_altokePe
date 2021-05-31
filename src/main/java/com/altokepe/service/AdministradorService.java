package com.altokepe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altokepe.repository.Administrador;
import com.altokepe.repositoryI.AdministradorRepositoryI;

@Service
public class AdministradorService {

	@Autowired
	private AdministradorRepositoryI administradoresRepositoryI;
	
	public String validarLogin(Administrador administradores) {
		return administradoresRepositoryI.validarLogin(
				administradores.getCorreo(),
				administradores.getContrasenia()
				);
	}
	
	public String listarAdministrador(int idusuario) {
		return administradoresRepositoryI.listarAdministradores(idusuario);
	}
	
	public String insertarAdministrador(Administrador administrador) {
		return administradoresRepositoryI.insertarAdministrador(
				administrador.getNombres(),
				administrador.getApellidos(),
				administrador.getCorreo(),
				administrador.getContrasenia(),
				administrador.getCelular(),
				administrador.getDni(),
				administrador.getOcupacion()
				);
	}
	
	public String actualizarAdministrador(Administrador administrador) {
		return administradoresRepositoryI.actualizarAdministrador(
				administrador.getIdadministrador(),
				administrador.getNombres(),
				administrador.getApellidos(),
				administrador.getCorreo(),
				administrador.getCelular(),
				administrador.getDni(),
				administrador.getOcupacion()
				);
	}
	
	public String eliminarAdministrador(int idadministrador) {
		return administradoresRepositoryI.eliminarAdministradores(idadministrador);
	}
	
	public String buscarPorNombre(Administrador administrador) {
		return administradoresRepositoryI.buscarPorNombre(administrador.getNombres());
	}
}
