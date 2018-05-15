package com.dawes.voto;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarVotosAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String idvotos = request.getParameter("idvoto");
		int id = Integer.parseInt(idvotos);	

		Voto voto = (Voto) su.getDetalleVoto(id);
		
		Cliente cliente = (Cliente) su.getDetalleCliente(request.getParameter("nombreClienteNuevo"));
		
		
		voto.setCliente(cliente);
		
		Multimedia multimedia = (Multimedia) su.getDetalleMultimedia(request.getParameter("multimediaNuevo"));
		
		voto.setMultimedia(multimedia);
		
		String puntos = request.getParameter("puntosNuevo");
		int puntosint = Integer.parseInt(puntos);
		
		voto.setPuntos(puntosint);
		
		
		Set<Voto> votosMulti = multimedia.getVotos();
		votosMulti.add(voto);
		multimedia.setVotos(votosMulti);
		su.update(multimedia);
		
		
		Set<Voto> votosClie = cliente.getVotos();
		votosClie.add(voto);
		cliente.setVotos(votosClie);
		su.update(cliente);
		
		
		su.update(voto);
		
		
		return "index.html";
	}

}
