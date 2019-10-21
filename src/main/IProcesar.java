package main;

import java.util.ArrayList;

/**
 * Interface usada para proccesar String (Palabras o Bloques) antes de de/codificar.
 * @author rubennp
 *
 */
public interface IProcesar {
	public ArrayList<String> dividir(String cadena);
	public String unir(ArrayList<String> cadenas);
}
