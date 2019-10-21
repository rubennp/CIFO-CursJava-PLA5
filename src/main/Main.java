package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Clase principal donde arranca programa
 * @author rubennp
 */
public class Main {
	private static final String cadena = "Hola, mi nombre es Rubèn Nieto";
	
	/**
	 * Inicio
	 * @param args son los argumentos de línea de comandos
	 */
	public static void main(String[] args) {
		// Carga los contextos
		AnnotationConfigApplicationContext contextoPC = new AnnotationConfigApplicationContext(CfgPC.class);
		AnnotationConfigApplicationContext contextoPI = new AnnotationConfigApplicationContext(CfgPI.class);
		
		// pide el bean en los distintos contextos
		Codificador codPC = contextoPC.getBean("codificador", Codificador.class);
		Codificador codPI = contextoPI.getBean("codificador", Codificador.class);
		
		// ejecuta codificar() y decodificar en el contexto Palabras-Cesar
		String cc = codPC.codificar(cadena);
		System.out.println(cc);
		System.out.println(codPC.decodificar(cc));
		
		// ejecuta codificar() y decodificar en el contexto Palabras-Invertir
		cc = codPI.codificar(cadena);
		System.out.println(cc);
		System.out.println(codPI.decodificar(cc));
		
		// cierra los contextos
		contextoPC.close();
		contextoPI.close();
	}
}