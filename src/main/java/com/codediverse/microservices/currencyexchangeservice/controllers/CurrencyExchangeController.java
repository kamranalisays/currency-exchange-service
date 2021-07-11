package com.codediverse.microservices.currencyexchangeservice.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.codediverse.microservices.currencyexchangeservice.responseobjects.CurrencyExchange;

@RestController
public class CurrencyExchangeController {

	@Autowired
	Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to )
	{
		String port= environment.getProperty("server.port");

		
		return  new  CurrencyExchange(100L, from , to , BigDecimal.valueOf(150), port ) ;
	}
	
	
	
}
