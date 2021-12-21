package Problema2;

public class Problema2 {

	public static void main(String[] args) {
		//atributo de IA Castilla la Mancha
		int nCasos; //Por niveles, del 1 al 4
		
		boolean covid;
		boolean	contactoReciente;
		boolean sintomas;
		boolean pasaporteCovid;
		int edad;
		
		double precioBillete;
		int aforo;
		int aforoMaximo;
	}
	
	public double precioFinal(int nCasos,boolean covid,boolean contacto,boolean sintomas,boolean pasaporteCovid,
			int edad,double precio,int aforo, int aforoMaximo) {
		
		if(!covid || !contacto || !sintomas) {
			
			switch(nCasos) {
				case 0: 
					if(aforo < aforoMaximo) {
						if(edad<23) {
							return precio*0.4;
						}
						if(edad>65) {
							return precio*0.2;
						}
						return precio;
					}
					else {
						return -1;
					}
					
				case 1:
					if(aforo < aforoMaximo) {
						if(edad<23) {
							return precio*0.7;
						}
						if(edad>65) {
							return precio*0.5;
						}
						return precio;
					}
					else {
						return-1;
					}
					
				case 2:
					if(aforo < aforoMaximo) {
						if(edad>65) {
							return precio*1.2;
						}
						return precio;
					}
					else {
						return -1;
					}
					
				case 3:
					if(aforo < aforoMaximo*0.2) {
						if(edad<23) {
							return precio*1.2;
						}
						if(edad>65) {
							return precio*1.5;
						}
						return precio;
					}
					else {
						return -1;
					}
					
				case 4:
					if(aforo < aforoMaximo*0.1) {
						if(edad<23) {
							return precio*1.5;
						}
						if(edad>65) {
							return -1;
						}
						return precio;
					}
					else {
						return -1;
					}
			}
			return precio;
		}
		else {
			return -1;
		}
	}
}
