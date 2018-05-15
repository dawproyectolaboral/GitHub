package com.dawes.modelo;
// Generated 27-ene-2018 16:42:27 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Pruebacultural generated by hbm2java
 */
@Entity
@Table(name = "pruebacultural", catalog = "gamitour", uniqueConstraints = @UniqueConstraint(columnNames = "nombre"))
public class Pruebacultural implements java.io.Serializable {

	private Integer idpruebacultural;
	private Parada parada;
	private String nombre;
	private String pregunta;
	private String respuesta;
	private Integer puntos;

	@Override
	public String toString() {
		return "Pruebacultural [idpruebacultural=" + idpruebacultural + ", parada=" + parada.getNumeroParada() + ", nombre=" + nombre
				+ ", pregunta=" + pregunta + ", respuesta=" + respuesta + ", puntos=" + puntos + "]";
	}

	public Pruebacultural() {
	}

	public Pruebacultural(Parada parada, String nombre) {
		this.parada = parada;
		this.nombre = nombre;
	}

	public Pruebacultural(Parada parada, String nombre, String pregunta, String respuesta, Integer puntos) {
		this.parada = parada;
		this.nombre = nombre;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.puntos = puntos;
	}
	
	public Pruebacultural(Integer idpruebacultural, Parada parada, String nombre, String pregunta, String respuesta, Integer puntos) {
		this.idpruebacultural = idpruebacultural;
		this.parada = parada;
		this.nombre = nombre;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.puntos = puntos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idpruebacultural", unique = true, nullable = false)
	public Integer getIdpruebacultural() {
		return this.idpruebacultural;
	}

	public void setIdpruebacultural(Integer idpruebacultural) {
		this.idpruebacultural = idpruebacultural;
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

	@Column(name = "pregunta", length = 200)
	public String getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	@Column(name = "respuesta", length = 45)
	public String getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	@Column(name = "puntos")
	public Integer getPuntos() {
		return this.puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
}