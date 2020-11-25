package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{

	private Integer CantidadDeKilometrosEntrenados;
	private Integer distanciaPreferida;
	
	
	public Corredor(Integer nroSocio, String nombre, Integer distanciaPreferida) {
		super(nroSocio, nombre);
		this.CantidadDeKilometrosEntrenados=CantidadDeKilometrosEntrenados;
		this.distanciaPreferida=distanciaPreferida;
	}



	public Integer getCantidadDeKilometrosEntrenados() {
		return CantidadDeKilometrosEntrenados;
	}



	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		CantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}



	public Object getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return this.distanciaPreferida;
	}



}
