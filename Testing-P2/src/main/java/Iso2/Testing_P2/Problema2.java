package Iso2.Testing_P2;

public class Problema2 {

	public Problema2() {}
	
	//Se devuelve -1 si no se puede viajar o si algunos de los par�metros enteros es negativo
	public double precioFinal(int nCasos, boolean covid, boolean contacto, boolean sintomas, boolean pasaporteCovid,
			int edad, double precio, int ocupados, int aforoMaximo) {
		
		if(edad < 0 || precio < 0 || ocupados < 0 || aforoMaximo < 0) return -1;
		
		if(!(covid || contacto || sintomas) && pasaporteCovid) {
			
			switch(nCasos) {
				case 0: 
					if(ocupados < aforoMaximo) {
						if(edad < 23) {
							return precio * 0.4;
						}
						if(edad > 65) {
							return precio * 0.2;
						}
						return precio;
					}
					
				case 1:
					if(ocupados < aforoMaximo * 0.8) {
						if(edad < 23) {
							return precio * 0.7;
						}
						if(edad > 65) {
							return precio * 0.5;
						}
						return precio;
					}
					
				case 2:
					if(ocupados < aforoMaximo * 0.6 * 0.4) {
						if(edad > 65) {
							return precio * 1.2;
						}
						return precio;
					}
					
				case 3:
					if(ocupados < aforoMaximo * 0.4 * 0.2) {
						if(edad < 23) {
							return precio * 1.2;
						}
						if(edad > 65) {
							return precio * 1.5;
						}
						return precio;
					}
					
				case 4:
					if(ocupados < aforoMaximo * 0.3 * 0.1) {
						if(edad < 23) {
							return precio * 1.5;
						}
						if(edad > 65) {
							return -1;
						}
						return precio;
					}
			}
			return -1;
		}
		else {
			return -1;
		}
	}
}
