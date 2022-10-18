package ar.edu.unlam.figuras;

public class Rectangulo extends Figura{
  //creo atributos porque me pide calcular la esquina superior derecha 
	private Punto esqSupDer;

	
	
	
	public Rectangulo (Punto puntoOrigen, Double ladoEjeX, Double ladoEjeY) {
	}
	
	@Override
	public Double calcularArea() {
		return getDistanciaX()*getDistanciaY();
	}

	@Override
	public Double calcularPerimetro() {
		return getDistanciaX()*2 + getDistanciaY()*2;
	}
	
	public void calcularEsqSupDer(Punto esqInfIzq, Double ladoEjeX,Double ladoEjeY) {
		 esqSupDer = new Punto (esqInfIzq.getPosicionX()+ladoEjeX,esqInfIzq.getPosicionY()+ladoEjeY);
	}
	
	public Punto getEsqSupDer() {
		return esqSupDer;
	}

}
