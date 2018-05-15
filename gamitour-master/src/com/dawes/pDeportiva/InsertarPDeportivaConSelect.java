package com.dawes.pDeportiva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Parada;
import com.dawes.modelo.Pruebadeportiva;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarPDeportivaConSelect extends Accion {
	

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		request.setAttribute("listParad", su.getMostrarParadas());
		
		return "/contenido/pDeportivas/FormInsertarPDeportivaConSelect.jsp";
	}
}
	