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

	
		
	}
	public Object inscribirEnEvento(String string, Deportista celeste) {
	
		
		return null;
	}
	
}
