package me.laio.crossfitrating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CrossfitRatingApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
		SpringApplication.run(CrossfitRatingApplication.class, args);
        //String teste = "Basic " + new String(Base64Utils.encode(("client:secret").getBytes()));
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CrossfitRatingApplication.class);
    }
}
