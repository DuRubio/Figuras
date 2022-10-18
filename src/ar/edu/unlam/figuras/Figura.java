package ar.edu.unlam.figuras;

public abstract class Figura implements Comparable<Figura>{
	private Punto puntoOrigen;
	private Double distanciaX;
	private Double distanciaY;
	
	public Figura() {
		this.distanciaX=distanciaX=0.0;
		this.distanciaY=distanciaY=0.0;
	}
	
	public Figura(Punto puntoOrigen, Double distanciaX, Double distanciaY) {
		this.puntoOrigen=puntoOrigen;
		this.distanciaX=distanciaX;
		this.distanciaY=distanciaY;
	}
	
	public Punto getPuntoOrigen() {
		return puntoOrigen;
	}

	public void setPuntoOrigen(Punto puntoOrigen) {
		this.puntoOrigen = puntoOrigen;
	}

	public Double getDistanciaX() {
		return distanciaX;
	}

	public void setDistanciaX(Double distanciaX) {
		this.distanciaX = distanciaX;
	}

	public Double getDistanciaY() {
		return distanciaY;
	}

	public void setDistanciaY(Double distanciaY) {
		this.distanciaY = distanciaY;
	}

	
	public abstract Double calcularArea();
	
	public abstract Double calcularPerimetro();
	
	public void mover(Double deltaX, Double deltaY) {
	puntoOrigen.setPosicionX(puntoOrigen.getPosicionX()+deltaX);
	puntoOrigen.setPosicionY(puntoOrigen.getPosicionY()+deltaY);
	}
	@Override
	public int compareTo(Figura o) {
		int resultado = 0;
		if (this.calcularArea() < o.calcularArea()) {
			resultado = -1;
		} else if (this.calcularArea() > o.calcularArea()) {
			resultado = 1;
		}
		return resultado;
	}

	
	
	
}
