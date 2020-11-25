package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista{
	
	private String tipoDeBisicleta;


	public Ciclista(Integer nroSocio, String nombre, String tipoDeBicicleta) {
		super(nroSocio, nombre);
		this.tipoDeBisicleta=tipoDeBicicleta;
	}


	public String getTipoDeBicicleta() {
		return tipoDeBisicleta;
	}


	public void setTipoDeBisicleta(String tipoDeBisicleta) {
		this.tipoDeBisicleta = tipoDeBisicleta;
	}






}
