package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador{
	
	private String estiloPreferido;

	public Nadador(Integer nroSocio, String nombre, String estiloPreferido) {
		super(nroSocio, nombre);
		this.estiloPreferido=estiloPreferido;	
		}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}


	public Integer getNumeroDeSocio() {
		
		return super.getNumeroDeSocio();
	}



}
