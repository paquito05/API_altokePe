package com.altokepe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altokepe.repository.Pedidos;
import com.altokepe.repositoryI.PedidosRepositoryI;

@Service
public class PedidosService {

	@Autowired
	private PedidosRepositoryI pedidosRepositoryI;
	
	public String listarPedidos(int idpedido) {
		return pedidosRepositoryI.listarPedidos(idpedido);
				
	}
	
	public String insertarPedidos(Pedidos pedidos) {
		return pedidosRepositoryI.insertarPedidos(
				pedidos.getNombre(),
				pedidos.getDireccion(),
				pedidos.getCantidad(),
				pedidos.getDescripcion(),
				pedidos.getFechapedido(),
				pedidos.getIdusuario(),
				pedidos.getIdmenu()
				);
				
	}
	
	public String actualizarPedidos(Pedidos pedidos) {
		return pedidosRepositoryI.actualizarPedidos(
				pedidos.getIdpedido(),
				pedidos.getNombre(),
				pedidos.getDireccion(),
				pedidos.getCantidad(),
				pedidos.getDescripcion(),
				pedidos.getFechapedido(),
				pedidos.getIdusuario(),
				pedidos.getIdmenu()
				);
				
	}
	
	public String eliminarPedidos(int idpedidos) {
		return pedidosRepositoryI.eliminarPedidos(idpedidos);
				
	}
	
	
	public String buscarPedidosFecha(Pedidos pedidos) {
		return pedidosRepositoryI.buscarPedidosFecha(
				pedidos.getFechapedido()
				
				);
				
	}
	
	public String buscarPedidosNombre(Pedidos pedidos) {
		return pedidosRepositoryI.buscarPedidosNombre(
				pedidos.getNombre()
				);
				
	}
}
