package com.example.springjenkins;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

import java.util.logging.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringJenkinsApplication {
	public static Logger Logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
    @PostConstruct
	public void init() {
		Logger.info("Application Started");
	}
	public static void main(String[] args) {
		Logger.info("Application Executed.........");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
