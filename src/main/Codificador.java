package main;

import java.util.ArrayList;

/**
 * Codifica String dado segun configuración
 * @author rubennp
 */
public class Codificador {
	private IProcesar procesar;
	private ICodificar codificar;
	
	/**
	 * Constructor de clase
	 * @param procesar es la clase que usará para procesar cadena (dividir en Palabras o Bloques)
	 * @param codificar es la clase que usará para codificar partes dadas por IProcesar (Cesar o Invertir)
	 */
	public Codificador (IProcesar procesar, ICodificar codificar) {
		this.procesar = procesar;	
		this.codificar = codificar;
	}
	
	/**
	 * Codifica
	 * @param cadena es el String a codificar
	 * @return cadena codificada
	 */
	public String codificar (String cadena) {
		ArrayList<String> result = new ArrayList<String>();
		
		result = this.procesar.dividir(cadena);
		for (int i = 0; i < result.size(); i++) 
			result.set(i, this.codificar.codificar(result.get(i)));
		
		return this.procesar.unir(result);
	}
	
	/**
	 * Decodifica
	 * @param cadena es el String a decodificar
	 * @return cadena decodificada
	 */
	public String decodificar (String cadena) {
		ArrayList<String> result = new ArrayList<String>();
		
		result = this.procesar.dividir(cadena);
		for (int i = 0; i < result.size(); i++) 
			result.set(i, this.codificar.decodificar(result.get(i)));
		
		return this.procesar.unir(result);
	}
	
}
