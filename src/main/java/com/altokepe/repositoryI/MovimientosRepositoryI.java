package com.altokepe.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altokepe.repository.Movimientos;

@Repository
public interface MovimientosRepositoryI extends CrudRepository<Movimientos, Integer>{
	
		@Procedure(name="listar_movimientos")
		public String listarMovimientos(
				@Param("in_idusuario") int idusuario
				);
		
		@Procedure(name="recargar_saldo")
		public String recargarSaldo(
				@Param("in_idusuario") int idusuario,
				@Param("in_monto") Double monto
				);


}
