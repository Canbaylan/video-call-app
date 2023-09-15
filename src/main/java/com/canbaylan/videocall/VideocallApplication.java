package com.canbaylan.videocall;

import com.canbaylan.videocall.service.UserService;
import com.canbaylan.videocall.user.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService service){
		return args -> {
			service.register(User.builder()
							.username("Can")
							.email("canbaylan@gmail.com")
							.password("canpsw")
					.build());
			service.register(User.builder()
					.username("Yunus")
					.email("yun@gmail.com")
					.password("yunpsw")
					.build());
			service.register(User.builder()
					.username("burak")
					.email("burak@gmail.com")
					.password("burpsw")
					.build());
		};
	}
}
