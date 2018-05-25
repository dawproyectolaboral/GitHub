package com.dawes.util;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Rol;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;

public class ModificarRolUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cliente cliente = seleccionarCliente();
		
		if(cliente.getNick()!=null){
			
			modificarRol(cliente);
			
		}
		
		System.out.println("");
		System.out.println("Hasta pronto.");
	
	}

	private static void modificarRol(Cliente cliente) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		Scanner teclado = new Scanner(System.in);
		
		boolean cambiado = false;
		
		cliente = (Cliente) su.getDetalleCliente(cliente.getNick());
		
		System.out.println("Rol actual :"+ cliente.getRol().getNombre());
		System.out.println("Que rol quieres que tenga el cliente : ");
		
		List<Rol> roles = su.getMostrarRoles();
		for(int i=0; i< roles.size(); i++){
			
			System.out.println(roles.get(i).getNombre());
			
		}
		
		String seleccionRol = teclado.nextLine();
		for(int i=0; i<roles.size();i++){
			
			if(roles.get(i).getNombre().equals(seleccionRol)){
				System.out.println("Cambiando rol por : "+ seleccionRol +" ..");
				
				Rol rolSeleccionado = (Rol) su.getDetalleRol(seleccionRol);
				cliente.setRol(rolSeleccionado);
				su.update(cliente);
				
				System.out.println("cliente actualizado");
			
				su.update(rolSeleccionado);
				
				System.out.println("rol actualizado");
				
				cambiado = true;
				
			}
			
		}
		if(cambiado){
			
			System.out.println("Se ha cambiado el rol");
		}else{
			
			System.out.println("No se ha encontrado el rol.");
		}
		
		
		
	}

	private static Cliente seleccionarCliente() {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		Scanner teclado = new Scanner(System.in);
		
		Cliente clienteencontrado = new Cliente();
		
		System.out.println("Usuarios disponibles :");
		
		List<Cliente> clientes = su.getMostrarClientes();
		
		for(int i=0; i < clientes.size(); i++){
			
			System.out.println(clientes.get(i).getNick());
			
		}
		
		System.out.println("");
		System.out.println("Escribe el nick del cliente : ");
		String nombreSelect = teclado.nextLine();
		
		boolean encontrado = false;
		
		for(int i=0; i < clientes.size(); i++ ){
			
			Cliente cliente = clientes.get(i);
			
			if(cliente.getNick().equals(nombreSelect)){
				
				System.out.println("Cliente seleccionado : "+ cliente.getNick());
				clienteencontrado = cliente;
				
				encontrado = true;
			}

		}
		
		if(!encontrado){
			System.out.println("No se ha encontrado al usuario");
			
		}
		
		return clienteencontrado;

	}


}
