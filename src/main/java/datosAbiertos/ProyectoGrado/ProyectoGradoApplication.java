package datosAbiertos.ProyectoGrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProyectoGradoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoGradoApplication.class, args);
	}

	/*@Bean
	public RestTemplate restTemplate(){ return  new RestTemplate();}//


	 */


}
