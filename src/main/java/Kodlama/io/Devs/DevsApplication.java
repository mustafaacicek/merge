package Kodlama.io.Devs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevsApplication.class, args);

//		SoftwareLanguagesService service = new SoftwareLanguagesManager(new InMemoryLanguageRepository());
//		List<SoftwareLanguage> languages = service.getAll();
//
//		languages.forEach(l->{
//			System.out.println(l.getLanguageName());
//		});
	}

}