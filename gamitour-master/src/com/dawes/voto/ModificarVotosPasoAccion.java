package com.dawes.voto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarVotosPasoAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String idvoto = request.getParameter("idvoto");
		Integer id = Integer.valueOf(idvoto);
		
		
		Voto voto = (Voto) su.getDetalleVoto(id);
		
		request.setAttribute("idvoto", voto.getIdvoto());
		request.setAttribute("puntos", voto.getPuntos());
		request.setAttribute("cliente", voto.getCliente());
		request.setAttribute("multimedia", voto.getMultimedia());
		request.setAttribute("clientes", su.getMostrarClientes());
		request.setAttribute("multimedias", su.getMostrarMultimedias());
		
		
		
		
		return "contenido/votos/ModificarVotos.jsp";
	}

}
