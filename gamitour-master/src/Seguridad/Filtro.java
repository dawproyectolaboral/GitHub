package Seguridad;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Rol;


/**
 * Servlet Filter implementation class Filtro
 */
@WebFilter("/Filtro")
public class Filtro implements Filter {

    /**
     * Default constructor. 
     */
    public Filtro() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("pasa por filtro");
		
		/*convertimos en HttpServlet*/
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		/*instanciamos session*/
		HttpSession sesion = req.getSession();
		
		String url = req.getServletPath();
		sesion.setAttribute("url", url);
		
		Cliente c = (Cliente) req.getSession().getAttribute("usuario");
	
		System.out.println("comprueba el usuario "+ c);
		Rol rol = (Rol) req.getSession().getAttribute("rol");
		System.out.println("comprueba el rol "+ rol);
		
		if(url.contains(rol.getNombre()) || rol.getNombre().equals("admin")){
			System.out.println("pasa");
			chain.doFilter(request, response);
		}else{
			System.out.println("sin privilegios de acceso");
			res.sendRedirect("/indexpanel.html");
		}
		
		
		
		// pass the request along the filter chain
		//chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
