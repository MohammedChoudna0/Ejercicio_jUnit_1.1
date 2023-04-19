package org.cuatrovientos.ed;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CadenaTest {


	@Test
	public void longtitud() {
		Cadena target = new Cadena();
		int expected = 9 ; 
		int actual = target.longitud("123456789");
		 assertEquals("La longtitud es ",expected,actual);
	}

	
	
	@Test
	public void vocales() {
		Cadena target = new Cadena();
		int expected = 3 ; 
		int actual = target.contarVocales("Prueba");
		 assertEquals("El número de vocales es",expected,actual);
		
	}

	@Test
	public void invertir() {
		Cadena target = new Cadena();
		String expected = "987654321" ; 
		String actual = target.invertir("123456789");
		 assertEquals("El número de vocales es",expected,actual);
		
	}
	@Test

	public void contarLetra() {
		Cadena target = new Cadena();
		int expected = 3 ; 
		int actual = target.contarLetra("abcabcqwertya", 'a');
		 assertEquals("el numero ¡es",expected,actual);
	}
	
	@Test
	public void longtitudQ() {
		Cadena target = new Cadena();
		int expected = 9 ; 
		int actual = target.longitud("");
		 assertEquals("La longtitud es ",expected,actual);
	}

	
	
	@Test
	public void vocalesQ() {
		Cadena target = new Cadena();
		int expected = 3 ; 
		int actual = target.contarVocales("");
		 assertEquals("El número de vocales es",expected,actual);
		
	}

	@Test
	public void invertirQ() {
		Cadena target = new Cadena();
		String expected = "987654321" ; 
		String actual = target.invertir("");
		 assertEquals("El número de vocales es",expected,actual);
		
	}
	@Test

	public void contarLetraQ() {
		Cadena target = new Cadena();
		int expected = 3 ; 
		int actual = target.contarLetra("", 'a');
		 assertEquals("el numero ¡es",expected,actual);
		
	}
	
}
