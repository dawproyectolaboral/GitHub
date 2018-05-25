package com.dawes.util;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Rol;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;

public class GenerarRol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		mostrarRoles();
		
		agregarRol();
		
		
	}

	private static void mostrarRoles() {
		// TODO Auto-generated method stub
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		System.out.println("ROLES ACTUALES : ");
		List<Rol> roles = su.getMostrarRoles();
		for(int i=0; i< roles.size(); i++){
			System.out.println(roles.get(i).getNombre());
		}
	}

	private static void agregarRol() {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		System.out.println("Indique el nombre del nuevo rol");
		String nombreRol = teclado.nextLine();
		
		System.out.println("El nombre indicado es :"+ nombreRol);
		System.out.println("¿Estas seguro de querer agregarlo? S/N");
		String respuesta = teclado.nextLine();
		if(respuesta.equals("s")|| respuesta.equals("S")){
			
			Rol rol = new Rol(nombreRol);
			su.insertar(rol);
			System.out.println("Rol "+ nombreRol +" insertado.");
			Rol insertado = (Rol) su.getDetalleRol(nombreRol);
			System.out.println(insertado);
			
		}else{
			System.out.println("No se agregará el nuevo rol");
		}
		System.out.println("Hasta pronto..");
	}

}
