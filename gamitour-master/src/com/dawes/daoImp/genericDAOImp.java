package com.dawes.daoImp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

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

public class genericDAOImp implements genericDAO{
	
	
	SessionFactory sf;
	public genericDAOImp(SessionFactory sf){
		this.sf = sf;
	}
	
	@Override
	public void insertar(Object insertar) {
		sf.getCurrentSession().beginTransaction();
		sf.getCurrentSession().save(insertar);
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();
	}
	
	@Override
	public void borrar(Object borrar) {
		
		sf.getCurrentSession().beginTransaction();
		sf.getCurrentSession().delete(borrar);
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();
	}
	@Override
	public void update(Object update) {
		sf.getCurrentSession().beginTransaction();
		sf.getCurrentSession().update(update);
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();
	}
	@Override
	public Object getDetalleNoticia(String busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT n FROM Noticia n where nombre=:nombre");
		q.setParameter("nombre", busqueda);
		Noticia noticia = (Noticia) q.getSingleResult();
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();
		return noticia;
	}
	
	@Override
	public Object getDetalleRol(String busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT r FROM Rol r where nombre=:nombre");
		q.setParameter("nombre", busqueda);
		Rol rol = (Rol) q.getSingleResult();
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();
		return rol;
	}
	
	@Override
	public Object getDetalleCliente(String busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT c FROM Cliente c where nick=:nick");
		q.setParameter("nick", busqueda);
		Cliente cliente = (Cliente) q.getSingleResult();
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();
		return cliente;
	}
	
	@Override
	public Object getDetalleComentario(int busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT c FROM Comentario c where idcomentario=:idcomentario");
		q.setParameter("idcomentario", busqueda);
		Comentario comentario = (Comentario) q.getSingleResult();
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();						
		return comentario;
	}

	@Override
	public Object getDetalleVoto(int busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT v FROM Voto v where idvoto=:idvoto");
		q.setParameter("idvoto", busqueda);
		Voto voto = (Voto) q.getSingleResult();
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();		
		return voto;
	}

	@Override
	public Object getDetalleMultimedia(String busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT m FROM Multimedia m where titulo=:titulo");
		q.setParameter("titulo", busqueda);
		Multimedia multimedia = (Multimedia) q.getSingleResult();
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();										
		return multimedia;
	}

	@Override
	public Object getDetallePremio(String busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT p FROM Premio p where nombre=:nombre");
		q.setParameter("nombre", busqueda);
		Premio premio = (Premio) q.getSingleResult();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return premio;
	}

	@Override
	public Object getDetalleActividad(String busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT a FROM Actividad a where nombre=:nombre");
		q.setParameter("nombre", busqueda);
		Actividad actividad = (Actividad) q.getSingleResult();
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();
		return actividad;
	}

	@Override
	public Object getDetalleItinerario(String busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT it FROM Itinerario it where nombre=:nombre");
		q.setParameter("nombre", busqueda);
		Itinerario itinerario = (Itinerario) q.getSingleResult();	
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return itinerario;
	}

	@Override
	public Object getDetalleParada(int busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT pa FROM Parada pa where numeroParada =:numeroParada");
		q.setParameter("numeroParada", busqueda);
		Parada parada = (Parada) q.getSingleResult();
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();
		return parada;
	}

	@Override
	public Object getDetallePruebaCultural(String busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT prc FROM Pruebacultural prc where nombre=:nombre");
		q.setParameter("nombre", busqueda);
		Pruebacultural pruebac = (Pruebacultural) q.getSingleResult();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return pruebac;
	}

	@Override
	public Object getDetallePruebaDeportiva(String busqueda) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT prd FROM Pruebadeportiva prd where nombre=:nombre");
		q.setParameter("nombre", busqueda);
		Pruebadeportiva pruebad = (Pruebadeportiva) q.getSingleResult();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return pruebad;
	}
	
/******************************************/
	@Override
	public List<Noticia> getMostrarNoticias() {
		sf.getCurrentSession().beginTransaction();
		//Query q = sf.getCurrentSession().createQuery("SELECT new list(n.idnoticia, n.nombre, n.texto, n.fechaalta, n.fechacaducidad, n.imagen) FROM Noticia as n");
		Query q = sf.getCurrentSession().createQuery("SELECT new Noticia(n.idnoticia, n.nombre, n.texto, n.fechaalta, n.fechacaducidad, n.imagen) FROM Noticia as n");
		//List<Noticia> listado= q.list();
		List<Noticia> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}
	

	

	@Override
	public List<Rol> getMostrarRoles() {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT new Rol(r.nombre) FROM Rol as r ");
		List<Rol> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}

	@Override
	public List<Cliente> getMostrarClientes() {
		sf.getCurrentSession().beginTransaction();
		//Query q = sf.getCurrentSession().createQuery("SELECT new list(c.idcliente, c.nombre, c.apellidos,c.fechanacimiento, c.email, c.password, c.telefono, c.direccion, c.codigopostal, c.avatar, c.puntosacumulados, c.fecharegistro, c.rol.idrol, c.nick) FROM Cliente as c");
		Query q = sf.getCurrentSession().createQuery("SELECT new Cliente(c.idcliente, c.nombre, c.apellidos,c.fechanacimiento, c.email, c.password, c.telefono, c.direccion, c.codigopostal, c.avatar, c.puntosacumulados, c.fecharegistro, c.nick) FROM Cliente as c");
		//List<Cliente> listado= q.list();
		List<Cliente> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();
		sf.getCurrentSession().close();
		return listado;
	}

	@Override
	public List<Comentario> getMostrarComentarios() {
		sf.getCurrentSession().beginTransaction();
		//Query q = sf.getCurrentSession().createQuery("SELECT new list(c.idcomentario, c.texto, c.cliente.nick, c.multimedia.titulo) FROM Comentario as c");
		Query q = sf.getCurrentSession().createQuery("SELECT new Comentario(c.idcomentario, c.texto, c.cliente, c.multimedia) FROM Comentario as c");
		//List<Comentario> listado= q.list();
		List<Comentario> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}

	@Override
	public List<Voto> getMostrarVotos() {
		sf.getCurrentSession().beginTransaction();
		//Query q = sf.getCurrentSession().createQuery("SELECT new list(v.idvoto, v.puntos, v.cliente.nick, v.multimedia.titulo) FROM Voto as v");
		Query q = sf.getCurrentSession().createQuery("SELECT new Voto(v.idvoto, v.puntos, v.cliente, v.multimedia) FROM Voto as v");
		//List<Voto> listado= q.list();
		List<Voto> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}

	@Override
	public List<Premio> getMostrarPremios() {
		sf.getCurrentSession().beginTransaction();
		//Query q = sf.getCurrentSession().createQuery("SELECT new list(p.idpremio, p.nombre, p.descripcion, p.imagen, p.fechaactivacion, p.fechaconsumo, p.puntos, p.cliente.idcliente) FROM Premio as p");
		Query q = sf.getCurrentSession().createQuery("SELECT new Premio(p.idpremio, p.nombre, p.descripcion, p.imagen, p.fechaactivacion, p.fechaconsumo, p.puntos, p.cliente) FROM Premio as p");
		//List<Premio> listado= q.list();
		List<Premio> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}

	@Override
	public List<Actividad> getMostrarActividades() {
		sf.getCurrentSession().beginTransaction();
		//Query q = sf.getCurrentSession().createQuery("SELECT new list(a.idactividad,a.nombre,a.fechainicio,a.fechafin,a.ubicacion,a.numparticipantes,a.precio,a.imagen,a.puntos) FROM Actividad as a");
		Query q = sf.getCurrentSession().createQuery("SELECT new Actividad(a.idactividad,a.nombre,a.fechainicio,a.fechafin,a.ubicacion,a.numparticipantes,a.precio,a.imagen,a.puntos) FROM Actividad as a");
		//List<Actividad> listado= q.list();
		List<Actividad> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}

	@Override
	public List<Itinerario> getMostrarItinerarios() {
		sf.getCurrentSession().beginTransaction();
		//Query q = sf.getCurrentSession().createQuery("SELECT new list(i.iditinerario, i.nombre, i.categoria, i.duracion, i.ubicacion) FROM Itinerario as i");
		Query q = sf.getCurrentSession().createQuery("SELECT new Itinerario(i.iditinerario, i.nombre, i.categoria, i.duracion, i.ubicacion) FROM Itinerario as i");
		//List<Itinerario> listado= q.list();
		List<Itinerario> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}
	
	@Override
	public List<Parada> getMostrarParadas() {
		sf.getCurrentSession().beginTransaction();
		//Query q = sf.getCurrentSession().createQuery("SELECT new list(p.idparada, p.nombre, p.numeroParada, p.ubicacion, p.historia, p.anecdotario, p.gastronomia, p.imagen, p.itinerario.iditinerario) FROM Parada as p");
		Query q = sf.getCurrentSession().createQuery("SELECT new Parada(p.idparada, p.itinerario, p.nombre, p.numeroParada, p.ubicacion, p.historia, p.anecdotario, p.gastronomia, p.imagen) FROM Parada as p");
		//List<Parada> listado= q.list();
		List<Parada> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}
	
	@Override
	public List<Parada> getMostrarParadasItinerario(int id) {
		sf.getCurrentSession().beginTransaction();
		//Query q = sf.getCurrentSession().createQuery("SELECT new list(p.idparada, p.nombre, p.numeroParada, p.ubicacion, p.historia, p.anecdotario, p.gastronomia, p.imagen, p.itinerario.iditinerario) FROM Parada as p WHERE p.itinerario.iditinerario=:id");
		Query q = sf.getCurrentSession().createQuery("SELECT new Parada(p.idparada,  p.itinerario,p.nombre, p.numeroParada, p.ubicacion, p.historia, p.anecdotario, p.gastronomia, p.imagen) FROM Parada as p WHERE p.itinerario.iditinerario=:id");
		q.setParameter("id", id);
		List<Parada> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}

	@Override
	public List<Pruebacultural> getMostrarPruebasCultural() {
		sf.getCurrentSession().beginTransaction();
		//Query q = sf.getCurrentSession().createQuery("SELECT new list(pc.idpruebacultural,pc.nombre,pc.pregunta,pc.respuesta,pc.puntos,pc.parada.idparada) FROM Pruebacultural as pc");
		Query q = sf.getCurrentSession().createQuery("SELECT new Pruebacultural(pc.idpruebacultural, pc.parada, pc.nombre,pc.pregunta,pc.respuesta,pc.puntos) FROM Pruebacultural as pc");
		//List<Pruebacultural> listado= q.list();
		List<Pruebacultural> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}
	
	@Override
	public List<Pruebacultural> getMostrarPCulturalesParada(int id) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT new Pruebacultural(pc.idpruebacultural,pc.parada,pc.nombre,pc.pregunta,pc.respuesta,pc.puntos) FROM Pruebacultural as pc WHERE pc.parada.idparada=:id");
		q.setParameter("id", id);
		List<Pruebacultural> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}

	@Override
	public List<Pruebadeportiva> getMostrarPruebasDeportiva() {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT new Pruebadeportiva(pd.idpruebadeportiva, pd.parada,  pd.nombre, pd.fechainicio, pd.fechafin, pd.explicacion,pd.puntos, pd.pdf, pd.video) FROM Pruebadeportiva as pd");
		List<Pruebadeportiva> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}
	
	@Override
	public List<Pruebadeportiva> getMostrarPDeportivasParada(int id) {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("SELECT new Pruebadeportiva(pd.idpruebadeportiva,  pd.parada, pd.nombre, pd.fechainicio, pd.fechafin, pd.explicacion, pd.puntos, pd.pdf, pd.video) FROM Pruebadeportiva as pd WHERE pd.parada.idparada=:id");
		q.setParameter("id", id);
		List<Pruebadeportiva> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}

	@Override
	public List<Multimedia> getMostrarMultimedias() {
		sf.getCurrentSession().beginTransaction();
		//Query q = sf.getCurrentSession().createQuery("SELECT new list(m.idmultimedia,m.fecha,m.comentario,m.imagen,m.video,m.cliente.nick,m.pruebadeportiva.nombre,m.puntosacumulados,m.titulo ) FROM Multimedia as m");
		Query q = sf.getCurrentSession().createQuery("SELECT new Multimedia(m.idmultimedia,m.cliente,m.pruebadeportiva,m.fecha,m.comentario,m.imagen,m.video,m.puntosacumulados,m.titulo ) FROM Multimedia as m");
		//List<Multimedia> listado= q.list();
		List<Multimedia> listado= q.getResultList();
		sf.getCurrentSession().getTransaction().commit();	
		sf.getCurrentSession().close();
		return listado;
	}
}	