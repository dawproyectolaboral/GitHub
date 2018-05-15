package com.dawes.voto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarVotoAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String convertir = request.getParameter("idvoto");
		Integer id = Integer.valueOf(convertir);
		Voto voto = (Voto)su.getDetalleVoto(id);
		
		request.setAttribute("id", voto.getIdvoto());
		
		request.setAttribute("cliente", voto.getCliente().getNick());
		
		request.setAttribute("multimedia", voto.getMultimedia().getTitulo());
		
		Integer convertir2 = voto.getPuntos();
		String puntos = String.valueOf(convertir2);
		request.setAttribute("puntos", puntos);
		
		
		return "contenido/votos/ConfirmarBuscarVoto.jsp";
	}

}
