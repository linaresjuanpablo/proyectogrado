package datosAbiertos.ProyectoGrado;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication

public class ProyectoGradoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoGradoApplication.class, args);
	}


//	@Bean
//	public OpenAPI customOpenAPI() {
//		return new OpenAPI()
//				.info(new Info()
//						.title("DatosAbiertos-------")
//						.version("1.0")
//						.description("Consumo de datos abiertos del SECOP")
//						.termsOfService("http://swagger.io/terms/"));
//
//	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//
//				registry.addMapping("/**")
//						.allowedOrigins("*")
//						.allowedMethods("*")
//						.allowedHeaders("*");
//			}
//		};
//	}


}
