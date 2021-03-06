package com.codediverse.microservices.currencyexchangeservice.responseobjects;

import java.math.BigDecimal;

public class CurrencyExchange {

	private Long id;
	private String to;
	private String from;
	private BigDecimal conversionMultiple ;
	private String port;

	
	public CurrencyExchange() {
		super();
	}
	public CurrencyExchange(Long id, String to, String from, BigDecimal conversionMultiple , String port ) {
		super();
		this.id = id;
		this.to = to;
		this.from = from;
		this.conversionMultiple = conversionMultiple;
		this.port = port;
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}

	
	
	
}
