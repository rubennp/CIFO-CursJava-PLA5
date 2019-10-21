package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Clase de configuración de Spring (contexto Palabras-Cesar)
 * @author rubennp
 */
@Configuration
public class CfgPC {
	@Bean
	public Codificador codificador() {
		return new Codificador(new Palabras(), new Cesar()); 
	}
}
