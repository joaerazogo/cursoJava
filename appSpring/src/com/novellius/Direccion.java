package com.novellius;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Direccion {
	
	public String calle;
	public String cp;
	
	public Direccion() {
		
	}
	
	public Direccion(String calle, String cp) {
		
		this.calle = calle;
		this.cp = cp;
		
	}
	
	public String getCalle() {
		return calle;
	}
	
	public String getCp() {
		return cp;
	}
	
	@Autowired
	public void setCalle(@Value("Encino") String calle) {
		this.calle = calle;
	}
	
	@Autowired
	public void setCp(@Value("9999") String cp) {
		this.cp = cp;
	}
	
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", cp=" + cp + "]";
	}
	
	
	
}
