package org.cuatrovientos.ed;

public class Cadena {
	public int longitud(String cadena) {
		return cadena.length() ; 
	}
	public int contarVocales(String cadena) {
	    int contador = 0;
	    for (int i = 0; i < cadena.length(); i++) {
	        char c = cadena.charAt(i);
	        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	            contador++;
	        }
	    }
	    return contador;
	}
	public String invertir(String cadena) {
		StringBuilder result = new StringBuilder(cadena);
		result.reverse();
		return result.toString() ; 
	}
	public int contarLetra(String cadena, char caracter) {
	    int contador = 0;
	    for (int i = 0; i < cadena.length(); i++) {
	        char c = cadena.charAt(i);
	        if (c == caracter) {
	            contador++;
	        }
	    }
	    return contador;
	}
}