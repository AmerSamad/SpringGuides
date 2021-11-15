package com.spring.training.consumingwebservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
	
	
	private Long id;
	@JsonProperty("quote")
	private String quote;
	
	public Value() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	
	@Override
	public String toString() {
		return "Value{" + 
				"id=" + id +
				", quote='" + quote + '\'' + 
				'}';
	}
	
	
}
