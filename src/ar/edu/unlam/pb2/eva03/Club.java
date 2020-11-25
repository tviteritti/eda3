package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;


public class Club {
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String string) {
		
		this.socios = new HashSet<Deportista>();
		this.nombre = nombre;
		this.competencias = new TreeMap<String, Evento>();
	}
	
	
	public void agregarDeportista(Deportista deportista) {
		if(deportista instanceof Deportista)
			this.socios.add(deportista);
		
	}
	public Integer getCantidadSocios() {
		
		return socios.size();
	}
	public void crearEvento(TipoDeEvento tipo, String nombre) throws NoEstaPreparado{
		Evento nuevo = new Evento(nombre, tipo);
		switch(tipo) {
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			competencias.put(nombre, nuevo);
			break;
		case TRIATLON_IRONMAN:
			competencias.put(nombre, nuevo);
			break;
		case CARRERA_42K:
			competencias.put(nombre, nuevo);
			break;
			default:
				throw new NoEstaPreparado("Este evento no es compatible");
	}
		
	}
	public Object inscribirEnEvento(String string, Deportista celeste) {
	
		
		return null;
	}
	
}
