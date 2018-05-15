package com.dawes.multimedia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Actividad;
import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Pruebadeportiva;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarMultimediasAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceGenericDAO su = new ServiceGenericDAOImp();
		 

		Cliente cliente = (Cliente)su.getDetalleCliente(request.getParameter("nick"));	
		
		Pruebadeportiva pruebadeportiva = (Pruebadeportiva)su.getDetallePruebaDeportiva(request.getParameter("titulo"));	
		
		String comentario = request.getParameter("comentario");	
		String imagen = request.getParameter("imagen");
		String video=request.getParameter("video");
		Integer puntosacumulados= 0;
		String titulo = request.getParameter("titulo");
		Set<Comentario> comentarios = new HashSet<Comentario>(0);
		Set<Voto> votos = new HashSet<Voto>(0);		
	
		Multimedia multimedia = new Multimedia(cliente,pruebadeportiva,new Date(),comentario,imagen,video,puntosacumulados,titulo,comentarios,votos);
		
		
		Set<Multimedia> multimediasclie = cliente.getMultimedias();
		multimediasclie.add(multimedia);
		cliente.setMultimedias(multimediasclie);
		su.update(cliente);

		
		Set<Multimedia> multimediapruebd = pruebadeportiva.getMultimedias();
		multimediapruebd.add(multimedia);
		pruebadeportiva.setMultimedias(multimediapruebd);
		su.update(pruebadeportiva);
		
		
		su.insertar(multimedia);
		
		return "index.html";
	}

	
	}

