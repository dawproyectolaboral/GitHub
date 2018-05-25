package com.dawes.util;

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
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;

public class BorrarTodosLosDatos {

	public static void main(String[] args) {

		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		//actividades
		List<Actividad> actividades = su.getMostrarActividades();
		for(int i=0; i< actividades.size(); i++){
			Actividad actividad = (Actividad) su.getDetalleActividad(actividades.get(i).getNombre());
			su.borrar(actividad);
		}
		
		//comentarios
		List<Comentario> comentarios = su.getMostrarComentarios();
		for(int i=0; i< comentarios.size(); i++){
			Comentario comentario = (Comentario) su.getDetalleComentario(comentarios.get(i).getIdcomentario());
			su.borrar(comentario);
		}
		
		//itinerarios
		List<Itinerario> itinerarios = su.getMostrarItinerarios();
		for(int i=0; i< itinerarios.size(); i++){
			Itinerario itinerario = (Itinerario) su.getDetalleItinerario(itinerarios.get(i).getNombre());
			su.borrar(itinerario);
		}
		
		//multimedias
		List<Multimedia> multimedias = su.getMostrarMultimedias();
		for(int i=0; i < multimedias.size(); i++){
			Multimedia multimedia = (Multimedia) su.getDetalleMultimedia(multimedias.get(i).getTitulo());
			su.borrar(multimedia);
		}
		
		
		//noticias
		List<Noticia> noticias = su.getMostrarNoticias();
		for(int i=0; i< noticias.size(); i++){
			Noticia noticia = (Noticia) su.getDetalleNoticia(noticias.get(i).getNombre());
			su.borrar(noticia);
		}
		
		
		
		//pCulturales
		List<Pruebacultural> pruebasCulturales = su.getMostrarPruebasCultural();
		for(int i=0; i< pruebasCulturales.size(); i++){
			Pruebacultural pruebac = (Pruebacultural) su.getDetallePruebaCultural(pruebasCulturales.get(i).getNombre());
			su.borrar(pruebac);
		}
		
		//pDeportivas
		List<Pruebadeportiva> pruebasDeportivas = su.getMostrarPruebasDeportiva();
		for(int i=0; i<pruebasDeportivas.size(); i++){
			Pruebadeportiva pruebad = (Pruebadeportiva) su.getDetallePruebaDeportiva(pruebasDeportivas.get(i).getNombre());
			su.borrar(pruebad);
		}
		//paradas
				List<Parada> paradas = su.getMostrarParadas();
				for(int i=0; i< paradas.size(); i++){
					Parada parada = (Parada) su.getDetalleParada(paradas.get(i).getNumeroParada());
					su.borrar(parada);
				}
		//premios
		List<Premio> premios = su.getMostrarPremios();
		for(int i=0; i< premios.size(); i++){
			Premio premio = (Premio) su.getDetallePremio(premios.get(i).getNombre());
			su.borrar(premio);
		}
		
		/*
		//usuarios
		List<Cliente> clientes = su.getMostrarClientes();
		for(int i=0; i < clientes.size(); i++){
			Cliente cliente = (Cliente) su.getDetalleCliente(clientes.get(i).getNick());
			su.borrar(cliente);
		}
		
		//Roles
		
		List<Rol> roles = su.getMostrarRoles();
		for(int i=0; i<roles.size(); i++){
			Rol rol = (Rol) su.getDetalleRol(roles.get(i).getNombre());
			su.borrar(rol);
		}
		*/
		
		System.out.println("Borrado..");
		
		
	}

}
