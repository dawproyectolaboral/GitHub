package Seguridad;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.util.Accion;

public class CerrarSesion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		request.getSession().removeAttribute("usuario");
		request.getSession().removeAttribute("rol");
		
		return "indexpanel.html";
	}

}
