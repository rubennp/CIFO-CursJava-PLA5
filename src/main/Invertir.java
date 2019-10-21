package main;

/**
 * Invierte el orden de la caracteres de un String dado
 * @author rubennp
 */
public class Invertir implements ICodificar {
	
	/**
	 * Devuelve el String invertido
	 */
	@Override
	public String codificar (String cadena) {
		String inv = "";
		
		for (int p = cadena.length()-1; p >= 0; p--) inv += cadena.charAt(p);
		
		return inv; 
	}
	
	/**
	 * Llama a codificar para devolver el String invertido
	 */
	@Override
	public String decodificar (String cadena) {
		return this.codificar(cadena);
	}
}