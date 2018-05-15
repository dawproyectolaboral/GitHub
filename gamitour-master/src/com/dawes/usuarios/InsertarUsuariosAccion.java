package com.dawes.usuarios;

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
import com.dawes.modelo.Premio;
import com.dawes.modelo.Rol;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarUsuariosAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		 
		Rol rol = (Rol)su.getDetalleRol("usuario");
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellidos");
		/*String a Date*/
		Date fecha = null;
		try {
			String fechaNacimiento = request.getParameter("fechaNacimiento");
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
			String strFecha = fechaNacimiento;
			fecha = formatoDelTexto.parse(strFecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* */
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String telefono = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		Date fechaRegistro = new Date();
		String codigoPostal = request.getParameter("cp");
		String avatar = "";
		Integer puntos = 0;
		String nick = request.getParameter("nick");
		Set<Premio> premios = new HashSet<Premio>(0);
		Set<Voto> votos = new HashSet<Voto>(0);
		Set<Comentario> comentarios = new HashSet<Comentario>(0);
		Set<Actividad> actividades = new HashSet<Actividad>(0);
		Set<Multimedia> multimedia = new HashSet<Multimedia>(0);
				
		
		Cliente usuario = new Cliente(rol,nombre,apellido,fecha,email,password,telefono,direccion,codigoPostal,avatar,puntos,fechaRegistro,nick,premios,votos,comentarios,actividades,multimedia);
		
		Set<Cliente> clientesrol = rol.getClientes();
		clientesrol.add(usuario);
		rol.setClientes(clientesrol);
		su.update(rol);
		
		su.insertar(usuario);
		
		
		return "index.html";
			}

}
