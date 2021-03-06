package com.dawes.modelo;
// Generated 27-ene-2018 16:42:27 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Pruebadeportiva generated by hbm2java
 */
@Entity
@Table(name = "pruebadeportiva", catalog = "gamitour", uniqueConstraints = @UniqueConstraint(columnNames = "nombre"))
public class Pruebadeportiva implements java.io.Serializable {

	private Integer idpruebadeportiva;
	private Parada parada;
	private String nombre;
	private Date fechainicio;
	private Date fechafin;
	private String explicacion;
	private Integer puntos;
	private Set<Multimedia> multimedias = new HashSet<Multimedia>(0);
	private String pdf;
	private String video;
	
	@Override
	public String toString() {
		return "Pruebadeportiva [ parada=" + parada.getNumeroParada() + ", nombre=" + nombre
				+ ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", explicacion=" + explicacion
				+ ", puntos=" + puntos + ", multimedias=" + multimedias + ", pdf=" + pdf + ", video=" + video + "]";
	}

	public Pruebadeportiva(Integer idpruebadeportiva, Parada parada, String nombre, Date fechainicio, Date fechafin,
			String explicacion, Integer puntos,  String pdf, String video) {
		super();
		this.idpruebadeportiva = idpruebadeportiva;
		this.parada = parada;
		this.nombre = nombre;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.explicacion = explicacion;
		this.puntos = puntos;
		this.pdf = pdf;
		this.video = video;
	}
	public Pruebadeportiva( Parada parada, String nombre, Date fechainicio, Date fechafin,
			String explicacion, Integer puntos,  String pdf, String video) {
		super();
		
		this.parada = parada;
		this.nombre = nombre;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.explicacion = explicacion;
		this.puntos = puntos;
		this.pdf = pdf;
		this.video = video;
	}

	public Pruebadeportiva(Parada parada, String nombre, Date fechainicio, Date fechafin, String explicacion,
			Integer puntos, Set<Multimedia> multimedias, String pdf, String video) {
		super();
		this.parada = parada;
		this.nombre = nombre;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.explicacion = explicacion;
		this.puntos = puntos;
		this.multimedias = multimedias;
		this.pdf = pdf;
		this.video = video;
	}

	public Pruebadeportiva(Integer idpruebadeportiva, Parada parada, String nombre, Date fechainicio, Date fechafin,
			String explicacion, Integer puntos, Set<Multimedia> multimedias, String pdf, String video) {
		super();
		this.idpruebadeportiva = idpruebadeportiva;
		this.parada = parada;
		this.nombre = nombre;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.explicacion = explicacion;
		this.puntos = puntos;
		this.multimedias = multimedias;
		this.pdf = pdf;
		this.video = video;
	}

	public Pruebadeportiva() {
	}

	public Pruebadeportiva(Parada parada, String nombre) {
		this.parada = parada;
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idpruebadeportiva", unique = true, nullable = false)
	public Integer getIdpruebadeportiva() {
		return this.idpruebadeportiva;
	}

	public void setIdpruebadeportiva(Integer idpruebadeportiva) {
		this.idpruebadeportiva = idpruebadeportiva;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "parada_idparada", nullable = false)
	public Parada getParada() {
		return this.parada;
	}

	public void setParada(Parada parada) {
		this.parada = parada;
	}

	@Column(name = "nombre", unique = true, nullable = false, length = 60)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechainicio", length = 10)
	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechafin", length = 10)
	public Date getFechafin() {
		return this.fechafin;
	}
	@Column(name = "pdf")
	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}
	@Column(name = "video")
	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	@Column(name = "explicacion", length = 200)
	public String getExplicacion() {
		return this.explicacion;
	}

	public void setExplicacion(String explicacion) {
		this.explicacion = explicacion;
	}

	@Column(name = "puntos")
	public Integer getPuntos() {
		return this.puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pruebadeportiva")
	public Set<Multimedia> getMultimedias() {
		return this.multimedias;
	}

	public void setMultimedias(Set<Multimedia> multimedias) {
		this.multimedias = multimedias;
	}
}