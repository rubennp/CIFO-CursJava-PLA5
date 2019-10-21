package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Clase de configuración de Spring (contexto Palabras-Invertir)
 * @author rubennp
 */
@Configuration
public class CfgPI {
	@Bean
	public Codificador codificador() {
		return new Codificador(new Palabras(), new Invertir()); 
	}	
}