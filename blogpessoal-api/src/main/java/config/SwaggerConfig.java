package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket docket(){
		return new Docket(DocumentationType.SWAGGER_2);
		((Object) select())
		//07/09/2020 StackEdit
		//https://stackedit.io/app# 2/4
		.apis( RequestHandlerSelectors.basePackage
		("generation.org.blogPessoal.controller") )
		.paths(PathSelectors.any())
		.build()
		.apiInfo(apiInfo());
	}
	




	private Object select() {
		// TODO Auto-generated method stub
		return null;
	}





	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
		.title("Blog Pessoal")
		.description("API do Projeto de blog pessoal")
		.version("1.0")
		.contact(contact())
		.build();
		}
		
	private Contact contact(){
		return new Contact("Yuri Santiago",
		"https://github.com/YuriSantiago999",
		"Futuro desenvolvedor Java/Full stack");
		}
	
	

}
