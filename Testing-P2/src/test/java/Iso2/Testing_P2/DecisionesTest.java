package Iso2.Testing_P2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class DecisionesTest {
	
	@Parameters
	public static Iterable<Object[]> eachuse(){
		return Arrays.asList(new Object[][]{
			{-10, true, false, false, false, -3, 0, -1, -15, -1},
			{0, false, false, false, true, 20, 8, 20, 700, 3.2},
			{1, false, false, false, true, 20, 8, 20, 700, 5.6},
			{2, false, false, false, true, 20, 8, 20, 700, 8},
			{3, false, false, false, true, 20, 8, 20, 700, 9.6},
			{4, false, false, false, true, 20, 8, 20, 700, 12},
			{5, false, false, false, true, 20, 8, 20, 700, -1},
			
			{0, false, false, false, true, 30, 8, 20, 700, 8},
			{1, false, false, false, true, 30, 8, 20, 700, 8},
			{3, false, false, false, true, 30, 8, 20, 700, 8},
			{4, false, false, false, true, 30, 8, 20, 700, 8},
			
			{0, false, false, false, true, 70, 8, 20, 700, 1.6},
			{1, false, false, false, true, 70, 8, 20, 700, 4},
			{2, false, false, false, true, 70, 8, 20, 700, 9.6},
			{3, false, false, false, true, 70, 8, 20, 700, 12},
			{4, false, false, false, true, 70, 8, 20, 700, -1},
		});
	}

	int nCasos;
	boolean covid;
	boolean contacto;
	boolean sintomas;
	boolean pasaporteCovid;
	int edad;
	double precio;
	int ocupados;
	int aforoMaximo;
	double esperado;
	

	public DecisionesTest(int nCasos, boolean covid, boolean contacto, boolean sintomas, boolean pasaporteCovid, int edad,
			double precio, int ocupados, int aforoMaximo, double esperado) {
		this.nCasos = nCasos;
		this.covid = covid;
		this.contacto = contacto;
		this.sintomas = sintomas;
		this.pasaporteCovid = pasaporteCovid;
		this.edad = edad;
		this.precio = precio;
		this.ocupados = ocupados;
		this.aforoMaximo = aforoMaximo;
		this.esperado = esperado;
	}



	@Test
	public void testing() {
		Problema2 prob = new Problema2();
		double result = prob.precioFinal(nCasos, covid, contacto, sintomas, pasaporteCovid, edad, precio, ocupados, aforoMaximo);
		assertEquals(esperado, result, .8);
	}

}
