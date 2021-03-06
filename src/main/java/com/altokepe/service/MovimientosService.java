package com.altokepe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altokepe.repository.Movimientos;
import com.altokepe.repositoryI.MovimientosRepositoryI;

@Service
public class MovimientosService {
	
	@Autowired
	private MovimientosRepositoryI movimientosRepositoryI;
	
	public String ListarMovimientos_pedidos(int idusuario) {
		return movimientosRepositoryI.listarMovimientos_pedidos(idusuario);
				
	}
	
	public String ListarMovimientos_recargas(int idusuario) {
		return movimientosRepositoryI.listarMovimientos_recargas(idusuario);
				
	}
	
	
	public String RecargarSaldo(Movimientos movimientos) {
		return movimientosRepositoryI.recargarSaldo(
			movimientos.getIdusuario(),
			movimientos.getMonto()
				);
				
	}

}
