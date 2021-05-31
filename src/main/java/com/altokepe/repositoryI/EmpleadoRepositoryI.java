package com.altokepe.repositoryI;

import java.util.Date;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altokepe.repository.Empleado;

@Repository
public interface EmpleadoRepositoryI extends CrudRepository<Empleado, Integer> {
	
	@Procedure(name="listar_empleador")
	public String listarEmpleados(
			@Param("in_idusuario") int idusuario
			);
	
	@Procedure(name="eliminar_empleado")
	public String eliminarEmpleado(
			@Param("in_idempleado") int idempleado
			);
	
	@Procedure(name="insertar_empleado")
	public String insertarEmpleado(
			@Param("in_nombres") String nombres,
			@Param("in_apellidos") String apellidos,
			@Param("in_dni") String dni,
			@Param("in_celular") String celular,
			@Param("in_correo") String correo,
			@Param("in_ocupacion") String ocupacion,
			@Param("in_sueldo") double sueldo,
			@Param("in_fechainicio") Date fechainicio,
			@Param("in_fechafin") Date fechafin
			);
	
	@Procedure(name="actualizar_empleado")
	public String actualizarEmpleado(
			@Param("in_idempleado") int idempleado,
			@Param("in_nombres") String nombres,
			@Param("in_apellidos") String apellidos,
			@Param("in_dni") String dni,
			@Param("in_celular") String celular,
			@Param("in_correo") String correo,
			@Param("in_ocupacion") String ocupacion,
			@Param("in_sueldo") double sueldo,
			@Param("in_fechainicio") Date fechainicio,
			@Param("in_fechafin") Date fechafin
			);
	
	@Procedure(name="buscar_empleado_nombre")
	public String buscarPorNombre(
			@Param("in_nombre") String nombres
			);
}
