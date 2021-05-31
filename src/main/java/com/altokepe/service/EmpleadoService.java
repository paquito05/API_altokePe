package com.altokepe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altokepe.repository.Empleado;
import com.altokepe.repositoryI.EmpleadoRepositoryI;

@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoRepositoryI empleadoRepositoryI;
	
	public String listarEmpleados(int idusuario) {
		return empleadoRepositoryI.listarEmpleados(idusuario);
	}
	
	public String insertarEmpleado(Empleado empleado) {
		return empleadoRepositoryI.insertarEmpleado(
				empleado.getNombres(), 
				empleado.getApellidos(),
				empleado.getDni(),
				empleado.getCelular(),
				empleado.getCorreo(),
				empleado.getOcupacion(),
				empleado.getSueldo(),
				empleado.getFechainicio(),
				empleado.getFechafin()
				);
	}
	
	public String actualizarEmpleado(Empleado empleado) {
		return empleadoRepositoryI.actualizarEmpleado(
				empleado.getIdempleado(),
				empleado.getNombres(),
				empleado.getApellidos(),
				empleado.getDni(),
				empleado.getCelular(),
				empleado.getCorreo(),
				empleado.getOcupacion(),
				empleado.getSueldo(),
				empleado.getFechainicio(),
				empleado.getFechafin()
				);
	}
	
	public String eliminarEmpleado(int idempleado) {
		return empleadoRepositoryI.eliminarEmpleado(idempleado);
	}
	
	public String buscarPorNombre(Empleado empleado) {
		return empleadoRepositoryI.buscarPorNombre(empleado.getNombres());
	}
}
