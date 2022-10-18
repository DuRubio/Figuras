package ar.edu.unlam.figuras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class testFiguras {
	static final Double distanciaX = 2.0;
	static final Double distanciaY = 3.0;

	@Test
	public void queSePuedaCrearPuntoEn0_0() {
		// Preparacion
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		// Ejecucion
		final Double posicionX = 0.0;
		final Double posicionY = 0.0;
		// Validacion
		Assert.assertEquals(posicionX, puntoOrigen.getPosicionX());
		Assert.assertEquals(posicionY, puntoOrigen.getPosicionY());

	}

	@Test
	public void queCoincidaElAreaEnRectangulo() {
		// preparacion
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		// ejecucion
		Rectangulo rectangulo = dadoQueExisteUnRectangulo(puntoOrigen);
		// contrastacion
		Assert.assertEquals(6, rectangulo.calcularArea(), 0.01);
	}

	@Test
	public void queCoincidaElAreaEnRElipse() {
		// preparacion
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		// ejecucion
		Elipse eli = new Elipse(puntoOrigen, distanciaX, distanciaY);
		// contrastacion
		Assert.assertEquals(18.84, eli.calcularArea(), 0.01);
	}

	@Test
	public void queCoincidaElAreaEnCuadradoDeLado2() {
		// preparacion
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		// ejecucion
		Cuadrado cuadradito = dadoQueExisteUnCuadrado(puntoOrigen);
		// contrastacion
		Assert.assertEquals(4, cuadradito.calcularArea(), 0.01);
	}

	@Test
	public void queCoincidaElAreaEnCirculo() {
		// preparacion
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		// ejecucion
		Circulo circulo = dadoQueExisteUnCirculo(puntoOrigen);
		// contrastacion
		Assert.assertEquals(12.56, circulo.calcularArea(), 0.01);
	}

	@Test
	public void queCoincidaElPerimetroEnCirculo() {
		// preparacion
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		// ejecucion
		Circulo circulo = dadoQueExisteUnCirculo(puntoOrigen);
		// contrastacion
		Assert.assertEquals(Math.PI * 4, circulo.calcularPerimetro(), 0.01);
	}

	@Test
	public void queElPerimetroDeLaElipseCoincida() {
		// preparacion
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		// ejecucion
		Elipse eli = new Elipse(puntoOrigen, distanciaX, distanciaY);
		// contrastacion
		Assert.assertEquals(16.011, eli.calcularPerimetro(), 0.01);
	}

	@Test
	public void queCoincidaElAreaEnTriangulo() {
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		TrianguloIsosceles triangulo = new TrianguloIsosceles(puntoOrigen, distanciaX, distanciaY);
		Assert.assertEquals(3.0, triangulo.calcularArea(), 0.01);

	}

	@Test
	public void queCoincidaElPerimetroEnTriangulo() {
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		TrianguloIsosceles triangulo = new TrianguloIsosceles(puntoOrigen, distanciaX, distanciaY);
		Assert.assertEquals(7.0, triangulo.calcularPerimetro(), 0.01);

	}

	@Test
	public void mover3_1UnaElipseEn0_0LaLlevaA2_3() {
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		Elipse eli = new Elipse(puntoOrigen, 2.0, 1.0);
		eli.mover(2.0, 3.0);
		Assert.assertEquals(2.0, eli.getPuntoOrigen().getPosicionX(), 0.001);
		Assert.assertEquals(3.0, eli.getPuntoOrigen().getPosicionY(), 0.001);
	}

	@Test
	public void moverCuadradoDe0_0a3_6() {
		// preparacion
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		// ejecucion
		Cuadrado cuadradito = dadoQueExisteUnCuadrado(puntoOrigen);
		cuadradito.mover(3.0, 6.0);
		// contrastacion
		Assert.assertEquals(3.0, cuadradito.getPuntoOrigen().getPosicionX(), 0.01);
		Assert.assertEquals(6.0, cuadradito.getPuntoOrigen().getPosicionY(), 0.01);
	}

	@Test
	public void calcularVerticeSupDerRectangulo() {
		// preparacion
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		// ejecucion
		Rectangulo rectangulo = dadoQueExisteUnRectangulo(puntoOrigen);
		rectangulo.calcularEsqSupDer(puntoOrigen, distanciaX, distanciaY);
		rectangulo.calcularEsqSupDer(puntoOrigen, distanciaX, distanciaY);
		// contrastacion
		Assert.assertEquals(2.0,rectangulo.getEsqSupDer().getPosicionX(),0.01);
		Assert.assertEquals(3.0,rectangulo.getEsqSupDer().getPosicionY(),0.01);
	}
	@Test
	public void ordenarListaDeFiguras() { //este metodo me obliga a hacer el compareTo y elegir el criterio de comparacion para luego el array
		Punto puntoOrigen = dadoQueExisteUnPuntoEn0_0();
		Elipse eli = new Elipse(puntoOrigen, distanciaX, distanciaY);
		Rectangulo rectangulo = dadoQueExisteUnRectangulo(puntoOrigen);
		Cuadrado cuadradito = dadoQueExisteUnCuadrado(puntoOrigen);
		TrianguloIsosceles triangulo = new TrianguloIsosceles(puntoOrigen, distanciaX, distanciaY);
		Circulo circulo = dadoQueExisteUnCirculo(puntoOrigen);
		
		ArrayList<Figura> listaFiguras = new ArrayList<>();
		
		listaFiguras.add(rectangulo);
		listaFiguras.add(eli);
		listaFiguras.add(cuadradito);
		listaFiguras.add(triangulo);
		listaFiguras.add(circulo);
		
		Collections.sort(listaFiguras);
		
		ArrayList<Figura> listaEsperada = new ArrayList <>();
		listaEsperada.add(triangulo);
		listaEsperada.add(cuadradito);
		listaEsperada.add(rectangulo);		
		listaEsperada.add(circulo);
		listaEsperada.add(eli);
		
		Assert.assertEquals(listaEsperada, listaFiguras);
		
	}

	private Punto dadoQueExisteUnPuntoEn0_0() {
		return new Punto(0.0, 0.0);
	}

	private Rectangulo dadoQueExisteUnRectangulo(Punto puntoOrigen) {
		return new Rectangulo(puntoOrigen, distanciaX, distanciaY);
	}

	private Cuadrado dadoQueExisteUnCuadrado(Punto puntoOrigen) {
		return new Cuadrado(puntoOrigen, distanciaX);
	}

	private Circulo dadoQueExisteUnCirculo(Punto puntoOrigen) {
		return new Circulo(puntoOrigen, distanciaX);
	}
}
