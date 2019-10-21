package main;

/**
 * Devuelve String codificado/decodificado siguiendo cifrado César
 * @author rubennp
 */
public class Cesar implements ICodificar {
	private final static String ALFABETO = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	private final static int totalLetras = ALFABETO.length();
	
	/**
	 * Devuelve String codificado
	 */
	@Override
	public String codificar (String cadena) {
		String result = "";
		
		for (char ch : cadena.toUpperCase().toCharArray()) {
			int p = ALFABETO.indexOf(ch);
			result += (p == -1) ? ch : ALFABETO.toCharArray()[(p + 2) % totalLetras];
		}
		
		return result;
	}
	
	/**
	 * Devuelve String decodificado
	 */
	@Override
	public String decodificar (String cadena) {
		String result = "";
		
		for (char ch : cadena.toUpperCase().toCharArray()) {
			int p = ALFABETO.indexOf(ch);
			result += (p == -1) ? ch : ALFABETO.toCharArray()[(p - 2) % totalLetras];
		}
		
		return result;
	}
}