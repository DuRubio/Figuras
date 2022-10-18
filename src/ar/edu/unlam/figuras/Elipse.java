package ar.edu.unlam.figuras;



public class Elipse extends Figura {
		
	public Elipse (Punto centro, Double radio1, Double radio2) {
		super(centro, radio1, radio2); // si son los mismos parametros que la clase padre no haría falta esta linea
	}
	
	@Override
	public Double calcularArea() {
		return Math.PI*super.getDistanciaX()*super.getDistanciaY();
		}

	@Override
	public Double calcularPerimetro() {
		return Math.sqrt((super.getDistanciaX()*super.getDistanciaX()+super.getDistanciaY()*super.getDistanciaY())/2)*2*Math.PI;
	}
}
