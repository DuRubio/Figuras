package ar.edu.unlam.figuras;

public class Punto {
	
	private Double posicionX;
	private Double posicionY;
	
	public Punto(Double x, Double y) {
		this.posicionX=x;
		this.posicionY=y;
	}

	public Punto () {
		this.posicionX=0.0;
		this.posicionY=0.0;
	}

	public Double getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(Double posicionX) {
		this.posicionX = posicionX;
	}

	public Double getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(Double posicionY) {
		this.posicionY = posicionY;
	}
	
}
