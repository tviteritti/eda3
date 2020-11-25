package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private String nombre;
	private Map<Integer, Deportista> participantes;
	
	public Evento(String nombre, TipoDeEvento tipo) {
		this.participantes=new HashMap<Integer, Deportista>();
		this.tipo=tipo;
		this.nombre=nombre;
	}
	
	public void agregarParticipante(Deportista d, Integer k) {
		participantes.put(k, d);
		
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}
	
}
