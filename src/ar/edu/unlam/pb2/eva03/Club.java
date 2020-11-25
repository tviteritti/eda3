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
	Boolean	corredor=false;
	Boolean tria=false;
	Boolean nadador=false;

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
		if(tipo==tipo.CARRERA_42K) {
		corredor= true;
		}
		if(tipo==tipo.CARRERA_NATACION_EN_AGUAS_ABIERTAS) {
			nadador= true;
			}
		if(tipo==tipo.TRIATLON_IRONMAN) {
			tria= true;
			}
		Evento e = new Evento(nombre, tipo);
	
		
	}
	public Boolean inscribirEnEvento(String string, Deportista celeste) throws NoEstaPreparado{
	if(celeste instanceof Corredor && tria==true) {
		throw new NoEstaPreparado("error");
	}
	if(celeste instanceof Corredor && nadador==true) {
		throw new NoEstaPreparado("error");
	}
	if(celeste instanceof Corredor && corredor==true) {
		return true;
	}
		
		return true;
	}
	
}
