package com.dawes.noticia;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.lang.jstl.parser.ParseException;

import com.dawes.modelo.Noticia;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;



public class InsertarNoticiaAccion extends Accion {
	
	
	ServiceGenericDAO su = new ServiceGenericDAOImp();
	
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		
		String nombre = request.getParameter("nombrenoticia");
		String nnoticia = request.getParameter("textonoticia");
		
		Date fechadealta = null;
		String fechaalta = request.getParameter("fechaalta");
		SimpleDateFormat formatoDelTexto1 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			fechadealta = formatoDelTexto1.parse(fechaalta);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Date fechadecaducidad = null;
		String fechacaducidad = request.getParameter("fechacaducidad");
		SimpleDateFormat formatoDelTexto2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			fechadecaducidad = formatoDelTexto2.parse(fechacaducidad);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String imagen = request.getParameter("imagen");
		
		Noticia noticia = new Noticia(nombre,nnoticia,fechadealta,fechadecaducidad,imagen);
		su.insertar(noticia);
		
		return "index.html";
		
		
	}

}
