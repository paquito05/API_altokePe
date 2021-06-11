package com.altokepe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altokepe.repository.Administrador;
import com.altokepe.repository.Usuario;
import com.altokepe.repository.Empleado;
import com.altokepe.repository.Menu;
import com.altokepe.repository.Movimientos;
import com.altokepe.repository.Pedidos;
import com.altokepe.service.AdministradorService;
import com.altokepe.service.UsuarioService;
import com.altokepe.service.EmpleadoService;
import com.altokepe.service.MenuService;
import com.altokepe.service.MovimientosService;
import com.altokepe.service.PedidosService;



@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/altokePe")
public class altokepeController {
	
	@Autowired
	private AdministradorService administradorService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private PedidosService pedidosService;
	
	
	@Autowired
	private MovimientosService movimientosService;
	
	
	/*
	 * STORE PROCEDURE ADMINISTRADOR
	 */
	
	//STORE PROCEDURE VALIDAR LOGIN ADMINISTRADOR
	@RequestMapping(value = "/administrador/login", method = RequestMethod.POST)
	public ResponseEntity<?> validarLogin(@RequestBody Administrador administrador) throws Exception{
		
		String data = administradorService.validarLogin(administrador);
		return new ResponseEntity<>(data,HttpStatus.OK);
		
	}
	
	/**
	 *   STORE PRECEDURE USUARIO 
	 */
	
	//STORE PROCEDURE LISTAR USUARIO
	
	@RequestMapping(value="/usuario/listar/{idusuario}", method = RequestMethod.GET)
	public ResponseEntity<?> listarUsuario(@PathVariable int idusuario) throws Exception{
				 
		String data = usuarioService.listarUsuario(idusuario);
				
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	//STORE PROCEDURE BUSCAR USUARIO POR NOMBRE
	
	@RequestMapping(value="/usuario/buscar/nombre", method = RequestMethod.POST)
	public ResponseEntity<?> buscarUsuarioNombre(@RequestBody Usuario usuario) throws Exception{
					 
		String data = usuarioService.buscarUsuarioNombre(usuario);
					
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	//STORE PROCEDURE BUSCAR USUARIO POR TELEFONO
	
	@RequestMapping(value="/usuario/buscar/telefono", method = RequestMethod.POST)
	public ResponseEntity<?> buscarUsuarioTelefono(@RequestBody Usuario usuario) throws Exception{
					 
		String data = usuarioService.buscarUsuarioTelefono(usuario);
					
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	//STORE PROCEDURE INSERTAR USUARIO
	@RequestMapping(value="/usuario/insertar",method = RequestMethod.POST)
		public ResponseEntity<?> insertarUsuario(@RequestBody Usuario usuario) throws Exception{
		String data = usuarioService.insertar_usuario(usuario);
					
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE ACTUALIZAR USUARIO
	@RequestMapping(value="/usuario/actualizar",method = RequestMethod.POST)
		public ResponseEntity<?> actualizarUsuario(@RequestBody Usuario usuario) throws Exception{
		String data = usuarioService.actualizar_usuario(usuario);
						
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE ACTUALIZAR CONTRASENIA USUARIO
	@RequestMapping(value="/usuario/actualizar/contrasenia",method = RequestMethod.POST)
		public ResponseEntity<?> actualizarUsuario_contrasenia(@RequestBody Usuario usuario) throws Exception{
		String data = usuarioService.actualizar_usuario_contrasenia(usuario);
						
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE ACTUALIZAR CONTRASENIA USUARIO
	@RequestMapping(value="/usuario/recuperar/contrasenia",method = RequestMethod.POST)
		public ResponseEntity<?>recuperarUsuario_contrasenia(@RequestBody Usuario usuario) throws Exception{
		String data = usuarioService.recuperar_usuario_contrasenia(usuario);
						
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	
	/*
	 *STORE PROCEDURE EMPLEADO 
	 */
	
	
	//STORE PROCEDURE INSERTAR EMPLEADO
	@RequestMapping(value="/empleado/insertar",method = RequestMethod.POST)
		public ResponseEntity<?> insertarEmpleado(@RequestBody Empleado empleado) throws Exception{
		String data = empleadoService.insertarEmpleado(empleado);
					
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
		
	//STORE PROCEDURE ACTUALIZAR EMPLEADO
	@RequestMapping(value="/empleado/actualizar",method = RequestMethod.POST)
		public ResponseEntity<?> actualizarEmpleado(@RequestBody Empleado empleado) throws Exception{
		String data = empleadoService.actualizarEmpleado(empleado);
						
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
		
	//STORE PROCEDURE ELIMINAR USUARIO EMPLEADO
	@RequestMapping(value="/empleado/eliminar/{idempleado}",method = RequestMethod.GET)
		public ResponseEntity<?> eliminarEmpleado(@PathVariable int idempleado) throws Exception{
		String data = empleadoService.eliminarEmpleado(idempleado);
							
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	
	//STORE PROCEDURE BUSCAR EMPLEADO POR NOMBRE
	@RequestMapping(value="/empleado/buscar/nombre",method = RequestMethod.POST)
		public ResponseEntity<?> buscarEmpleadoPorNombre(@RequestBody Empleado empleado) throws Exception{
		String data = empleadoService.buscarPorNombre(empleado);
								
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE LISTAR EMPLEADOS
	
	@RequestMapping(value="/empleados/listar/{idusuario}", method = RequestMethod.GET)
	public ResponseEntity<?> listarEmpleados(@PathVariable int idusuario) throws Exception{
		 
		String data = empleadoService.listarEmpleados(idusuario);
		
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	
	/*
	 * STORE PROCEDURE MENU
	 */
	
	//STORE PROCEDURE OBTENER ID MENU
		@RequestMapping(value="/menu/obtener/id/{idusuario}",method = RequestMethod.GET)
			public ResponseEntity<?> obtenerIdMenu(@PathVariable int idusuario) throws Exception{
			String data = menuService.obtenerIdMenu(idusuario);
										
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		//STORE PROCEDURE LISTAR  MENU
		@RequestMapping(value="/menu/listar/{idmenu}", method = RequestMethod.GET)
		public ResponseEntity<?> listarMenu(@PathVariable int idmenu) throws Exception{
			 
			String data = menuService.listarMenu(idmenu);
			
			return new ResponseEntity<>(data, HttpStatus.OK);
		}
	
		//STORE PROCEDURE INSERTAR MENU
		@RequestMapping(value="/menu/insertar", method= RequestMethod.POST)
		public ResponseEntity<?> insertarMenu(@RequestBody Menu menu) throws Exception{
							
			String data = menuService.insertarMenu(menu);
								
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		//STORE PROCEDURE ACTUALIZAR MENU
		@RequestMapping(value="/menu/actualizar", method= RequestMethod.POST)
		public ResponseEntity<?> actualizarMenu(@RequestBody Menu menu) throws Exception{
								
			String data = menuService.actualizarMenu(menu);
									
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		//STORE PROCEDURE ELIMINAR MENU
		
		@RequestMapping(value="/menu/eliminar/{idmenu}", method = RequestMethod.GET)
		public ResponseEntity<?> eliminarMenu(@PathVariable int idmenu) throws Exception{
			String data = menuService.eliminarMenu(idmenu);
				
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		
		
		/**
		 *  STORE PROCEDURE MOVIMIENTOS
		 * 
		 */
		
		
		//LISTAR PEDIDOS
		@RequestMapping(value="/movimientos/listar/{idusuario}", method = RequestMethod.GET)
		public ResponseEntity<?> ListarMovimientos(@PathVariable int idusuario) throws Exception{
			 
			String data = movimientosService.ListarMovimientos(idusuario);
			
			return new ResponseEntity<>(data, HttpStatus.OK);
		}
		
		
		//STORE PROCEDURE INSERTAR PEDIDOS
		@RequestMapping(value="/movimientos/insertar", method= RequestMethod.POST)
		public ResponseEntity<?> RecargarSaldo(@RequestBody Movimientos movimientos) throws Exception{
								
			String data = movimientosService.RecargarSaldo(movimientos);
										
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		
		/**
		 *  STORE PROCEDURE PEDIDOS
		 * 
		 */
		
		//LISTAR PEDIDOS
		@RequestMapping(value="/pedidos/listar/{idpedido}", method = RequestMethod.GET)
		public ResponseEntity<?> listarPedidos(@PathVariable int idpedido) throws Exception{
			 
			String data = pedidosService.listarPedidos(idpedido);
			
			return new ResponseEntity<>(data, HttpStatus.OK);
		}
		
		
		//STORE PROCEDURE INSERTAR PEDIDOS
		@RequestMapping(value="/pedidos/insertar", method= RequestMethod.POST)
		public ResponseEntity<?> insertarPedidos(@RequestBody Pedidos pedido) throws Exception{
								
			String data = pedidosService.insertarPedidos(pedido);
										
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		//STORE PROCEDURE ACTUALIZAR PEDIDOS
		@RequestMapping(value="/pedidos/actualizar", method= RequestMethod.POST)
		public ResponseEntity<?> actualizarPedidos(@RequestBody Pedidos pedido) throws Exception{
										
			String data = pedidosService.actualizarPedidos(pedido);
												
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		//STORE PROCEDURE ELIMINAR PEDIDOS
		
		@RequestMapping(value="/pedidos/eliminar/{idpedido}", method = RequestMethod.GET)
		public ResponseEntity<?> eliminarPedidos(@PathVariable int idpedido) throws Exception{
			String data = pedidosService.eliminarPedidos(idpedido);
						
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		//STORE PROCEDURE BUSCAR PEDIDOS POR NOMBRE
		@RequestMapping(value="/pedidos/buscar/nombre",method = RequestMethod.POST)
			public ResponseEntity<?> buscarPedidosPorNombre(@RequestBody Pedidos pedidos) throws Exception{
			String data = pedidosService.buscarPedidosNombre(pedidos);
									
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		//STORE PROCEDURE BUSCAR PEDIDOS POR NOMBRE
		@RequestMapping(value="/pedidos/buscar/fecha",method = RequestMethod.POST)
			public ResponseEntity<?> buscarPedidosPorFecha(@RequestBody Pedidos pedidos) throws Exception{
			String data = pedidosService.buscarPedidosFecha(pedidos);
											
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
	
	
}
