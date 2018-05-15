package com.dawes.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.actividades.BorrarActividadesAccion;
import com.dawes.actividades.InsertarActividadAccion;
import com.dawes.actividades.ModificarActividadesAccion;
import com.dawes.actividades.ModificarActividadesPasoAccion;
import com.dawes.actividades.MostrarActividadAccion;
import com.dawes.actividades.MostrarActividadesAccion;
import com.dawes.comentario.BorrarComentarioAccion;
import com.dawes.comentario.InsertarComentariosAccion;
import com.dawes.comentario.InsertarComentariosConSelectAccion;
import com.dawes.comentario.ModificarComentariosAccion;
import com.dawes.comentario.ModificarComentariosPasoAccion;
import com.dawes.comentario.MostrarComentarioAccion;
import com.dawes.comentario.MostrarComentariosAccion;
import com.dawes.itinerario.BorrarItinerarioAccion;
import com.dawes.itinerario.InsertarItinerarioAccion;
import com.dawes.itinerario.ModificarItinerarioPasoAccion;
import com.dawes.itinerario.ModificarItinerariosAccion;
import com.dawes.itinerario.MostrarItinerarioAccion;
import com.dawes.itinerario.MostrarItinerariosAccion;
import com.dawes.multimedia.BorrarMultimediaAccion;
import com.dawes.multimedia.InsertarMultimediasAccion;
import com.dawes.multimedia.InsertarMultimediasConSelectAccion;
import com.dawes.multimedia.ModificarMultimediasAccion;
import com.dawes.multimedia.ModificarMultimediasPasoAccion;
import com.dawes.multimedia.MostrarMultimediaAccion;
import com.dawes.multimedia.MostrarMultimediasAccion;
import com.dawes.noticia.BorrarNoticiaAccion;
import com.dawes.noticia.InsertarNoticiaAccion;
import com.dawes.noticia.MostrarNoticiaAccion;
import com.dawes.noticia.MostrarNoticiasAccion;
import com.dawes.pCultural.BorrarPCulturalAccion;
import com.dawes.pCultural.InsertarPCultural;
import com.dawes.pCultural.InsertarPCulturalConSelect;
import com.dawes.pCultural.ModificarPCulturalAccion;
import com.dawes.pCultural.ModificarPCulturalPasoAccion;
import com.dawes.pCultural.MostrarPCulturalAccion;
import com.dawes.pCultural.MostrarPCulturalesAccion;
import com.dawes.pCultural.MostrarPCulturalesParadaAccion;
import com.dawes.pDeportiva.BorrarPDeportivaAccion;
import com.dawes.pDeportiva.InsertarPDeportiva;
import com.dawes.pDeportiva.InsertarPDeportivaConSelect;
import com.dawes.pDeportiva.ModificarPDeportivaAccion;
import com.dawes.pDeportiva.ModificarPDeportivaPasoAccion;
import com.dawes.pDeportiva.MostrarPDeportivaAccion;
import com.dawes.pDeportiva.MostrarPDeportivasAccion;
import com.dawes.parada.BorrarParadaAccion;
import com.dawes.parada.InsertarParadaAccion;
import com.dawes.parada.InsertarParadaAccionSelect;
import com.dawes.parada.ParadaSelectAccion;
import com.dawes.parada.ModificarParadasAccion;
import com.dawes.parada.ModificarParadasPasoAccion;
import com.dawes.parada.MostrarPDeportivasParadaAccion;
import com.dawes.parada.MostrarParadaAccion;
import com.dawes.parada.MostrarParadasAccion;
import com.dawes.parada.MostrarParadasItinerarioAccion;
import com.dawes.premio.BorrarPremioAccion;
import com.dawes.premio.InsertarPremioAccion;
import com.dawes.premio.InsertarPremioConSelectAccion;
import com.dawes.premio.MostrarPremioAccion;
import com.dawes.premio.MostrarPremiosAccion;
import com.dawes.rol.BorrarRolAccion;
import com.dawes.rol.InsertarRolAccion;
import com.dawes.rol.MostrarRolAccion;
import com.dawes.rol.MostrarRolesAccion;
import com.dawes.usuarios.BorrarUsuarioAccion;
import com.dawes.usuarios.InsertarUsuariosAccion;
import com.dawes.usuarios.InsertarUsuariosExternoAccion;
import com.dawes.usuarios.ModificarUsuariosAccion;
import com.dawes.usuarios.ModificarUsuariosPasoAccion;
import com.dawes.usuarios.MostrarUsuarioAccion;
import com.dawes.usuarios.MostrarUsuariosAccion;
import com.dawes.voto.BorrarVotoAccion;
import com.dawes.voto.InsertarVotosAccion;
import com.dawes.voto.InsertarVotosConSelectAccion;
import com.dawes.voto.ModificarVotosAccion;
import com.dawes.voto.ModificarVotosPasoAccion;
import com.dawes.voto.MostrarVotoAccion;
import com.dawes.voto.MostrarVotosAccion;

import Seguridad.IniciarSessionAccion;


public abstract class Accion {
	
	//metodo abstracto ejecutar
	//le paso lo que recupera del servlet, peticion y respuesta.
	public abstract String ejecutar(HttpServletRequest request, HttpServletResponse response);
	
	//clase -->seleccion por el cliente.
	public static Accion getAccion(String tipo){
		
		/*ACTIVIDADES*/
		if(tipo.equals("InsertarActividades")){
			return new InsertarActividadAccion();
		}
		if(tipo.equals("MostrarActividad")){
			return new MostrarActividadAccion();
		}
		if(tipo.equals("MostrarActividades")){
			return new MostrarActividadesAccion();
		}
		if(tipo.equals("BorrarActividad")){
			return new BorrarActividadesAccion();
		}
		if(tipo.equals("ModificarActividades")){
		
			return new ModificarActividadesAccion();
		}
		if(tipo.equals("ModificarActividadPaso")){
			return new ModificarActividadesPasoAccion();
		}
		
		/*COMENTARIOS*/
		if(tipo.equals("InsertarComentarios")){
			return new InsertarComentariosAccion();
		}
		
		if(tipo.equals("InsertarComentariosConSelect")){
			return new InsertarComentariosConSelectAccion();
		}
	
		if(tipo.equals("MostrarComentario")){
			return new MostrarComentarioAccion();
		}
		if(tipo.equals("MostrarComentarios")){
			return new MostrarComentariosAccion();
		}
		if(tipo.equals("BorrarComentario")){
			return new BorrarComentarioAccion();
		}
		if(tipo.equals("ModificarComentarios")){
			return new ModificarComentariosAccion();
		}
		if(tipo.equals("ModificarComentariosPaso")){
			
			return new ModificarComentariosPasoAccion();
		}
		
		/*ITINERARIOS*/
		if(tipo.equals("InsertarItinerario")){
			return new InsertarItinerarioAccion();
		}
		if(tipo.equals("MostrarItinerario")){
			return new MostrarItinerarioAccion();
		}
		if(tipo.equals("MostrarItinerarios")){
			return new MostrarItinerariosAccion();
		}
		if(tipo.equals("BorrarItinerario")){
			return new BorrarItinerarioAccion();
		}
		if(tipo.equals("ModificarItinerarios")){
			return new ModificarItinerariosAccion();
		}
		if(tipo.equals("ModificarItinerarioPaso")){
			return new ModificarItinerarioPasoAccion();
		}
		
		
		
		/*MULTIMEDIAS*/
		if(tipo.equals("InsertarMultimedias")){
			return new InsertarMultimediasAccion();
		}
		if(tipo.equals("InsertarMultimediasConSelect")){
			return new InsertarMultimediasConSelectAccion();
		}
		
		if(tipo.equals("MostrarMultimedia")){
			return new MostrarMultimediaAccion();
		}
		if(tipo.equals("MostrarMultimedias")){
			return new MostrarMultimediasAccion();
		}
		if(tipo.equals("BorrarMultimedia")){
			return new BorrarMultimediaAccion();
		}
		if(tipo.equals("ModificarMultimedias")){
			return new ModificarMultimediasAccion();
		}
		if(tipo.equals("ModificarMultimediasPaso")){
			return new ModificarMultimediasPasoAccion();
		}
		
		
		/*NOTICIAS*/
		if(tipo.equals("InsertarNoticia")){
			return new InsertarNoticiaAccion();
		}
		if(tipo.equals("MostrarNoticia")){
			return new MostrarNoticiaAccion();
		}
		if(tipo.equals("MostrarNoticias")){
			return new MostrarNoticiasAccion();
		}
		if(tipo.equals("BorrarNoticia")){
			return new BorrarNoticiaAccion();
		}
		
		/*PARADAS*/
		if(tipo.equals("InsertarParada")) {
			return new InsertarParadaAccion();
		}
		if(tipo.equals("InsertarParadaSelect")) {
			
			return new InsertarParadaAccionSelect();
		}
		
		if(tipo.equals("ParadaSelect")) {
			return new ParadaSelectAccion();
		}
		if(tipo.equals("MostrarParada")) {
			return new MostrarParadaAccion();
		}
		if(tipo.equals("MostrarParadas")) {
			return new MostrarParadasAccion();
		}
		if(tipo.equals("BorrarParada")){
			return new BorrarParadaAccion();
		}
		if(tipo.equals("ModificarParadas")){
			return new ModificarParadasAccion();
		}
		if(tipo.equals("ModificarParadasPaso")){
			return new ModificarParadasPasoAccion();
		}
		if(tipo.equals("MostrarParadasItinerario")){
			return new MostrarParadasItinerarioAccion();
		}
		
		/*PRUEBAS CULTURALES*/
		if(tipo.equals("InsertarPCultural")) {
			return new InsertarPCultural();
		}
		if(tipo.equals("InsertarPCulturalConSelect")) {
			return new InsertarPCulturalConSelect();
		}
		if(tipo.equals("MostrarPCultural")) {
			return new MostrarPCulturalAccion();
		}
		if(tipo.equals("MostrarPCulturales")) {
			return new MostrarPCulturalesAccion();
		}
		if(tipo.equals("BorrarPCultural")){
			return new BorrarPCulturalAccion();
		}
		if(tipo.equals("ModificarPCultural")){
			return new ModificarPCulturalAccion();
		}
		if(tipo.equals("ModificarPCulturalPaso")){
			return new ModificarPCulturalPasoAccion();
		}
		if(tipo.equals("MostrarPCulturalesParada")){
			return new MostrarPCulturalesParadaAccion();
		}
		
		
		/*PRUEBAS DEPORTIVAS*/
		if(tipo.equals("InsertarPDeportiva")) {
			return new InsertarPDeportiva();
		}
		if(tipo.equals("InsertarPDeportivaConSelect")) {
			return new InsertarPDeportivaConSelect();
		}
		if(tipo.equals("MostrarPDeportiva")) {
			return new MostrarPDeportivaAccion();
		}
		if(tipo.equals("MostrarPDeportivas")) {
			return new MostrarPDeportivasAccion();
		}
		if(tipo.equals("BorrarPDeportiva")){
			return new BorrarPDeportivaAccion();
		}
		if(tipo.equals("ModificarPDeportiva")){
			return new ModificarPDeportivaAccion();
		}
		if(tipo.equals("MostrarPDeportivasParada")){
			return new MostrarPDeportivasParadaAccion();
		}
		if(tipo.equals("ModificarPDeportivaPaso")){
			return new ModificarPDeportivaPasoAccion();
		}
		
		
		
		/*PREMIOS*/
		if(tipo.equals("InsertarPremio")){
			return new InsertarPremioAccion();
		}
		if(tipo.equals("InsertarPremioConSelect")){
			return new InsertarPremioConSelectAccion();
		}
		if(tipo.equals("MostrarPremio")){
			return new MostrarPremioAccion();
		}
		if(tipo.equals("MostrarPremios")){
			return new MostrarPremiosAccion();
		}
		if(tipo.equals("BorrarPremio")){
			return new BorrarPremioAccion();
		}
		
		/*ROLES*/
		if(tipo.equals("InsertarRol")){
			return new InsertarRolAccion();
		}
		if(tipo.equals("MostrarRol")){
			return new MostrarRolAccion();
		}
		if(tipo.equals("MostrarRoles")){
			return new MostrarRolesAccion();
		}
		if(tipo.equals("BorrarRol")){
			return new BorrarRolAccion();
		}
		
		/*USUARIOS*/
		if(tipo.equals("InsertarUsuarios")){
			return new InsertarUsuariosAccion();
		}
		if(tipo.equals("InsertarUsuariosExterno")){
			return new InsertarUsuariosExternoAccion();
		}
		if(tipo.equals("MostrarUsuarios")){
			return new MostrarUsuariosAccion();
		}
		if(tipo.equals("MostrarUsuario")){
			return new MostrarUsuarioAccion();
		}
		if(tipo.equals("BorrarUsuario")){
			return new BorrarUsuarioAccion();
		}
		if(tipo.equals("ModificarUsuarios")){
			return new ModificarUsuariosAccion();
		}
		if(tipo.equals("ModificarUsuariosPaso")){
			return new ModificarUsuariosPasoAccion();
		}
		
		/*VOTOS*/
		if(tipo.equals("InsertarVoto")){
			return new InsertarVotosAccion();
		}
		if(tipo.equals("InsertarVotoConSelect")){
			return new InsertarVotosConSelectAccion();
		}
		if(tipo.equals("MostrarVoto")){
			return new MostrarVotoAccion();
		}
		if(tipo.equals("MostrarVotos")){
			return new MostrarVotosAccion();
		}
		if(tipo.equals("BorrarVoto")){
			return new BorrarVotoAccion();
		}
		if(tipo.equals("ModificarVotos")){
			return new ModificarVotosAccion();
		}
		if(tipo.equals("ModificarVotosPaso")){
			return new ModificarVotosPasoAccion();
		}
				
		
		/*INICIAR SESSION*/
		if(tipo.equals("iniciarSesion")){
			return new IniciarSessionAccion();
			
		}
		
		
		return null;
	}
}
