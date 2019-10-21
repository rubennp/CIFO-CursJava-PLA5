package main;

import java.util.ArrayList;

/**
 * Devuelve ArrayList con String divido en bloques de 4 caracteres o une siguiendo misma lógica
 * @author rubennp
 *
 */
public class Bloques implements IProcesar {
	
	/**
	 * Divide String en bloques de 4 y devuelve ArrayList
	 */
	@Override
	public ArrayList<String> dividir (String cadena) {
		ArrayList<String> cadenas = new ArrayList<String>();
		
		for (int p = 0; p < cadena.length(); p += 4)
			cadenas.add(cadena.substring(p, (p + 4 < cadena.length()) ? p + 4 : cadena.length()));
		
		return cadenas;
	}
	
	/**
	 * Une bloques de 4 caracteres y devuelve String
	 */
	@Override
	public String unir(ArrayList<String> cadenas) {
		String cadena = "";
		
		for (String cad : cadenas) cadena += cad;
		
		return cadena;
	}
}