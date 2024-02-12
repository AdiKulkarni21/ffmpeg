package com.ffmpeg.ffmpeg;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FfmpegApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FfmpegApplication.class, args);
		Execution e= new Execution();
		e.execution();
		
		
	}

}
