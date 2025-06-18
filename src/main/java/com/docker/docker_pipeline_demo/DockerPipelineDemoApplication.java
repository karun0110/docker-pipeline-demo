package com.docker.docker_pipeline_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerPipelineDemoApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "Spring docker pipeline project";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerPipelineDemoApplication.class, args);
	}

}
