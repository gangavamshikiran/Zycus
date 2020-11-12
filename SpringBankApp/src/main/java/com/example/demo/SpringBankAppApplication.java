package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.services.BankService;

@SpringBootApplication
public class SpringBankAppApplication {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context = SpringApplication.run(SpringBankAppApplication.class, args);
		BankService bankService = context.getBean(BankService.class);
		bankService.transfer(1L, 2L, 10);
		
		
		
	}

}
