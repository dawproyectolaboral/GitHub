package com.dawes.service;

import java.util.List;

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

public interface ServiceGenericDAO {

		public void insertar(Object insertar);
		public void borrar(Object borrar);
		public void update(Object update);
		
		public Object getDetalleNoticia(String busqueda);
		public List<Noticia> getMostrarNoticias();
		
		public Object getDetalleRol(String busqueda);
		public List<Rol> getMostrarRoles();
		
		public Object getDetalleCliente(String busqueda);
		public List<Cliente> getMostrarClientes();
		
		public Object getDetalleComentario(int busqueda);
		public List<Comentario> getMostrarComentarios();
		
		public Object getDetalleVoto(int busqueda);
		public List<Voto> getMostrarVotos();
		
		public Object getDetallePremio(String busqueda);
		public List<Premio> getMostrarPremios();
		
		public Object getDetalleActividad(String busqueda);
		public List<Actividad> getMostrarActividades();
		
		public Object getDetalleItinerario(String busqueda);
		public List<Itinerario> getMostrarItinerarios();
		
		
		public Object getDetalleParada(int busqueda);
		public List<Parada> getMostrarParadas();
		public List<Parada> getMostrarParadasItinerario(int id);
		
		public Object getDetallePruebaCultural(String busqueda);
		public List<Pruebacultural> getMostrarPruebasCultural();
		public List<Pruebacultural> getMostrarPCulturalesParada(int id);
		
		public Object getDetallePruebaDeportiva(String busqueda);
		public List<Pruebadeportiva> getMostrarPruebasDeportiva();
		public List<Pruebadeportiva> getMostrarPDeportivasParada(int id);
		
		public Object getDetalleMultimedia(String busqueda);
		public List<Multimedia> getMostrarMultimedias();	
	}