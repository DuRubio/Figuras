package ar.edu.unlam.figuras;

public class TrianguloIsosceles extends Figura{ //debe ser rectangulo isosceles
	
	
	public TrianguloIsosceles(Punto puntoOrigen, Double distanciaX, Double distanciaY) {
		super(puntoOrigen, distanciaX, distanciaY);
	}

	@Override
	public Double calcularArea() {
		return (getDistanciaX()*getDistanciaY())/2;
	}

	@Override
	public Double calcularPerimetro() {
		return 2*getDistanciaX()+getDistanciaY();
	}

}
