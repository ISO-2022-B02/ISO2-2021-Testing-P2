package Iso2.Testing_P2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class EachUseTest {
	
	@Parameters
	public static Iterable<Object[]> eachuse(){
		return Arrays.asList(new Object[][]{
			{-10, true, false, false, false, -3, -8, -30, -15, -1},
			{0, false, false, false, true, 20, 8, 20, 700, 3.2},
			{1, true, true, true, true, 30, 0, 0, 0, -1},
			{2, false, true, true, false, 70, -1, -1, -1, -1},
			{3, true, true, false, false, 0, 1, 1, 1, -1},
			{4, false, false, true, true, 23, -5, -600, -1000, -1},
			{-1, true, false, true, false, 65, -8, -30, -15, -1},
			{5, false, true, false, true, -1, 8, 30, 700, -1},
			{-50, true, false, false, true, 1, 0, 0, 0, -1},
			{300, false, true, true, false, 22, -1, -1, -1, -1},
			{-10, true, false , true, true, 24, 1, 1, 1, -1},
			{0, false, true, false, false, 64, -5, -600, -1000, -1},
			{1, true, true, true, false, 66, -8, -30, -15, -1},
			{2, false, false, false, true, -500, 8, 20, 700, -1},
			{3, true, false, false, true, 200, 0, 0, 0, -1}
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
	

	public EachUseTest(int nCasos, boolean covid, boolean contacto, boolean sintomas, boolean pasaporteCovid, int edad,
			double precio, int ocupados, int aforoMaximo, double esperado) {
		super();
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
