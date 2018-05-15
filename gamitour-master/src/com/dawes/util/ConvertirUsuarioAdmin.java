package com.dawes.util;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Rol;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;

public class ConvertirUsuarioAdmin {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*CLIENTES SELECCIONABLES*/
		verClientes();
		/*SELECCIONA CLIENTE QUE PASE A TENER ROL ADMIN*/
		crearAdmin();
	
	}

	private static void crearAdmin() {
		// TODO Auto-generated method stub
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Que usuario quieres que sea admin? Escribe el nick : ");
		String nick = teclado.nextLine();
		
		Cliente cliente = (Cliente) su.getDetalleCliente(nick);
		
		System.out.println("El cliente seleccionado es :\n NICK : "+ cliente.getNick() +", NOMBRE : "+ cliente.getNombre() +", ROL : "+ cliente.getRol());
		
		System.out.println("¿Es correcto?  S/N ");
		
		String respuesta = teclado.nextLine();
		
		if(respuesta.equals("s") || respuesta.equals("S")){
			
			Rol rol = (Rol) su.getDetalleRol("admin");
			Set<Cliente> clientes = rol.getClientes();
			clientes.add(cliente);
			su.update(rol);
			
			cliente.setRol(rol);
			su.update(cliente);
			Cliente clienteactualizado = (Cliente) su.getDetalleCliente(cliente.getNick());
			
			System.out.println("Rol actualizado..");
			System.out.println("rol del clientes :"+ clienteactualizado.getRol());
		}else{
			System.out.println("No se ha realizado ningun cambio ");
		}
		
		
	
	}

	private static void verClientes() {
		// TODO Auto-generated method stub
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		List<Cliente> clientes = su.getMostrarClientes();
		for(int i=0; i< clientes.size(); i++){
			
			Cliente cliente = clientes.get(i);
			System.out.println("NICK : "+ cliente.getNick()+" NOMBRE : " + cliente.getNombre());
			
		}
	}
	
	
	

}
