package com.dawes.util;

import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;

/*
 * CLASE SOLO PARA HACER PRUEBAS DE CODIGO, NO BORRAR POR FAVOR, GML 
 */
public class Pruebashardcode {
	// Atributo:
	ServiceGenericDAO su = new ServiceGenericDAOImp();
	
	public void generic(){
		//System.out.println(su.getMostrarParadasItinerario(5));
		//System.out.println(su.getMostrarPDeportivasParada(4));
		//System.out.println(su.getDetalleParada(2));
		
	}
	
	public static void main(String[] args) {
		Pruebashardcode p = new Pruebashardcode();
		
		
		p.generic();
		
	} // Fin main
} // Fin class