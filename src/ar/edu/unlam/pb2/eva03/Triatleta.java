package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Triatleta extends Deportista implements ICiclista {

	private String distanciaPreferida;
	TipoDeBicicleta tria;
	
	
	public Triatleta(Integer nroSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tria) {
		super(nroSocio, nombre);
		this.distanciaPreferida=distanciaPreferida;
		this.tria=tria;
		
		
	}


	public String getDistanciaPreferida() {
		
		return this.distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return tria;
	}

	public Integer getNumeroDeSocio() {
		// TODO Auto-generated method stub
		return super.getNumeroDeSocio();
	}

}
