package com.dawes.usuarios;

import java.util.ArrayList;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Actividad;
import com.dawes.modelo.Cliente;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Premio;
import com.dawes.modelo.Rol;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

import javassist.bytecode.Descriptor.Iterator;

public class MostrarUsuarioAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String nick = request.getParameter("nick");
		
		Cliente cliente = (Cliente)su.getDetalleCliente(nick);
		
		request.setAttribute("id", cliente.getIdcliente());
		request.setAttribute("nombre",cliente.getNombre());
		request.setAttribute("apellidos", cliente.getApellidos());
		request.setAttribute("fechaNaci", cliente.getFechanacimiento() );
		request.setAttribute("email", cliente.getEmail());
		request.setAttribute("password", cliente.getPassword());
		request.setAttribute("telefono",cliente.getTelefono());
		request.setAttribute("direccion",cliente.getDireccion());
		request.setAttribute("cp",cliente.getCodigopostal());
		request.setAttribute("avatar",cliente.getAvatar());
		request.setAttribute("puntos", cliente.getPuntosacumulados());
		request.setAttribute("fecharegi",cliente.getFecharegistro());
		Rol rol = cliente.getRol();
		request.setAttribute("rol",rol);
		request.setAttribute("nick",cliente.getNick());
		Set<Premio> premios = cliente.getPremios();
		request.setAttribute("premios", premios );
		Set<Voto> votos = cliente.getVotos();
		request.setAttribute("votos",votos );
		Set<Actividad> actividades = cliente.getActividads();
		request.setAttribute("actividades",actividades);
		Set<Multimedia> multimedias = cliente.getMultimedias();
		request.setAttribute("multimedias",multimedias );
		
		
		return "contenido/usuarios/ConfirmarBuscarUsuario.jsp";
	}

}
