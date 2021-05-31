package com.altokepe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altokepe.repository.Menu;
import com.altokepe.repositoryI.MenuRepositoryI;

@Service
public class MenuService {

	@Autowired
	private MenuRepositoryI menuRepositoryI;
	
	public String listarMenu(int idmenu) {
		return menuRepositoryI.listarMenu(idmenu);
	}
	
	public String insertarMenu(Menu menu) {
		return menuRepositoryI.insertarMenu(
				menu.getNombre(), 
				menu.getDescripcion(),
				menu.getPrecio(),
				menu.getImagen(),
				menu.getFechamenu()
				);
	}
	
	public String actualizarMenu(Menu menu) {
		return menuRepositoryI.actualizarMenu(
				menu.getIdproducto(),
				menu.getNombre(), 
				menu.getDescripcion(),
				menu.getPrecio(),
				menu.getImagen(),
				menu.getFechamenu()
			);
	}
	
	public String eliminarMenu(int idmenu) {
		return menuRepositoryI.eliminarMenu(idmenu);
	}
	
	public String obtenerIdMenu(int idusuario) {
		return menuRepositoryI.obtenerIdMenu(idusuario);
	}
}
