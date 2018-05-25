package Seguridad;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dawes.modelo.Cliente;
import com.dawes.modelo.Rol;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class IniciarSessionAccion extends Accion{

	
	
	
	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		if(request.getSession().getAttribute("usuario")!= null){
			request.getSession().removeAttribute("usuario");
			request.getSession().removeAttribute("rol");
		}
		
		
		
		String nick = request.getParameter("nick");
		String password = request.getParameter("password");
	

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		HttpSession sesion = req.getSession();
		
		//SI ESTAN VACIOS
		if(nick.equals("") || password.equals("")){
			//System.out.println("Valores introducidos no validos (vacios)");
			return "indexpanel.html";
		}
		
		Cliente c;
		//SI NO ENCUENTA POR NICK
		try {
			c = (Cliente) su.getDetalleCliente(nick);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println(e.getMessage());
			return "indexpanel.html";
			
		}
		//System.out.println("se encuentra el usuario :"+ c);
		//SI LA PASSWORD ES DISTINTA
		if(c.getPassword().equals(password)){
		//	System.out.println("coincide la contraseña");
		}else{
		//	System.out.println("la contraseña no coinide");
			return "indexpanel.html";
		}
		
		List<Rol> roles = su.getMostrarRoles();
		
		Rol rolUsuario = new Rol();
		
		//COMPRUEBA EL ROL
		for(int i=0; i< roles.size(); i++){
			Rol rol = roles.get(i);
			if(c.getRol().getNombre().equals(rol.getNombre())){
				rolUsuario = rol;
				// System.out.println("El rol del usuario es :"+ rolUsuario);
				
			}

		}
	
		
		request.getSession().setAttribute("usuario", c);
		request.getSession().setAttribute("rol", rolUsuario);
		

		if(rolUsuario.getNombre().equals("admin")){
			return "ZonaFiltro/admin/index.html";
		}else{
			return "ZonaFiltro/usuario/ejemploZonaUsuario.html";
		}
		
		
		
	}

}
