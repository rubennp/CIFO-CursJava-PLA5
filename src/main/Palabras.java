package main;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Divide String en palabras (separadas por " ").
 * @author rubennp
 */
public class Palabras implements IProcesar {
	
	/**
	 * Divide String y retorna ArrayList con sus palabras
	 */
	@Override
	public ArrayList<String> dividir (String cadena) {
		return new ArrayList<String>(Arrays.asList(cadena.split(" ")));
	}
	
	/**
	 * Une ArrayList de palabras en String
	 */
	@Override
	public String unir(ArrayList<String> cadenas) {
		return String.join(" ", cadenas);
	}
}
