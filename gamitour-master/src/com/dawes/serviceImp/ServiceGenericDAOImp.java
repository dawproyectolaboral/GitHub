package com.dawes.serviceImp;

import java.util.List;

import com.dawes.dao.genericDAO;
import com.dawes.modelo.Actividad;
import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Noticia;
import com.dawes.modelo.Parada;
import com.dawes.modelo.Premio;
import com.dawes.modelo.Pruebacultural;
import com.dawes.modelo.Pruebadeportiva;
import com.dawes.modelo.Rol;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.util.MySqlDAOFactory;

public class ServiceGenericDAOImp implements ServiceGenericDAO{

	
	MySqlDAOFactory f;
	genericDAO g;
	
	public ServiceGenericDAOImp(){
	
		f = new MySqlDAOFactory();
		g = f.getGenericDAO();
	
	}

	@Override
	public void insertar(Object insertar) {
		// TODO Auto-generated method stub
		g.insertar(insertar);
	}

	@Override
	public void borrar(Object borrar) {
		// TODO Auto-generated method stub
		g.borrar(borrar);
	}
	@Override
	public void update(Object update) {
		// TODO Auto-generated method stub
		g.update(update);
	}

	@Override
	public Object getDetalleNoticia(String busqueda) {
		// TODO Auto-generated method stub
		return g.getDetalleNoticia(busqueda);
	}

	@Override
	public Object getDetalleRol(String busqueda) {
		// TODO Auto-generated method stub
		return g.getDetalleRol(busqueda);
	}

	@Override
	public Object getDetalleCliente(String busqueda) {
		// TODO Auto-generated method stub
		return g.getDetalleCliente(busqueda);
	}

	
	@Override
	public Object getDetalleComentario(int busqueda) {
		// TODO Auto-generated method stub
		return g.getDetalleComentario(busqueda);
	}

	@Override
	public Object getDetalleVoto(int busqueda) {
		// TODO Auto-generated method stub
		return g.getDetalleVoto(busqueda);
	}


	@Override
	public Object getDetallePremio(String busqueda) {
		// TODO Auto-generated method stub
		return g.getDetallePremio(busqueda);
	}

	@Override
	public Object getDetalleActividad(String busqueda) {
		// TODO Auto-generated method stub
		return g.getDetalleActividad(busqueda);
	}

	@Override
	public Object getDetalleItinerario(String busqueda) {
		// TODO Auto-generated method stub
		return g.getDetalleItinerario(busqueda);
	}

	@Override
	public Object getDetalleParada(int busqueda) {
		// TODO Auto-generated method stub
		return g.getDetalleParada(busqueda);
	}

	@Override
	public Object getDetallePruebaCultural(String busqueda) {
		// TODO Auto-generated method stub
		return g.getDetallePruebaCultural(busqueda);
	}

	@Override
	public Object getDetallePruebaDeportiva(String busqueda) {
		// TODO Auto-generated method stub
		return g.getDetallePruebaDeportiva(busqueda);
	}

	@Override
	public Object getDetalleMultimedia(String busqueda) {
		// TODO Auto-generated method stub
		return g.getDetalleMultimedia(busqueda);
	}

	@Override
	public List<Noticia> getMostrarNoticias() {
		// TODO Auto-generated method stub
		return g.getMostrarNoticias();
	}

	@Override
	public List<Rol> getMostrarRoles() {
		// TODO Auto-generated method stub
		return g.getMostrarRoles();
	}

	@Override
	public List<Cliente> getMostrarClientes() {
		// TODO Auto-generated method stub
		return g.getMostrarClientes();
	}

	@Override
	public List<Comentario> getMostrarComentarios() {
		// TODO Auto-generated method stub
		return g.getMostrarComentarios();
	}

	@Override
	public List<Voto> getMostrarVotos() {
		// TODO Auto-generated method stub
		return g.getMostrarVotos();
	}

	@Override
	public List<Premio> getMostrarPremios() {
		// TODO Auto-generated method stub
		return g.getMostrarPremios();
	}

	@Override
	public List<Actividad> getMostrarActividades() {
		// TODO Auto-generated method stub
		return g.getMostrarActividades();
	}

	@Override
	public List<Itinerario> getMostrarItinerarios() {
		// TODO Auto-generated method stub
		return g.getMostrarItinerarios();
	}
	
	
	@Override
	public List<Parada> getMostrarParadas() {
		// TODO Auto-generated method stub
		return g.getMostrarParadas();
	}
	
	@Override
	public List<Parada> getMostrarParadasItinerario(int id) {
		// TODO Auto-generated method stub
		return g.getMostrarParadasItinerario(id);
	}
	
	@Override
	public List<Pruebacultural> getMostrarPruebasCultural() {
		// TODO Auto-generated method stub
		return g.getMostrarPruebasCultural();
	}
	
	@Override
	public List<Pruebacultural> getMostrarPCulturalesParada(int id) {
		return g.getMostrarPCulturalesParada(id);
	}

	@Override
	public List<Pruebadeportiva> getMostrarPruebasDeportiva() {
		// TODO Auto-generated method stub
		return g.getMostrarPruebasDeportiva();
	}
	
	@Override
	public List<Pruebadeportiva> getMostrarPDeportivasParada(int id) {
		return g.getMostrarPDeportivasParada(id);
	}

	@Override
	public List<Multimedia> getMostrarMultimedias() {
		// TODO Auto-generated method stub
		return g.getMostrarMultimedias();
	}
}