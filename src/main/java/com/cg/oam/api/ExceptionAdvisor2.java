package com.cg.oam.api;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.oam.exception.CustomerNotFoundException;
import com.cg.oam.exception.MedicineNotFoundException;

@RestControllerAdvice
public class ExceptionAdvisor2 {
	
	@ExceptionHandler(MedicineNotFoundException.class)
	public ResponseEntity<String> handleMedicineNotFoundExceptionAction(MedicineNotFoundException excep) {
		return new ResponseEntity<>(excep.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class) 
	public ResponseEntity<String> handleExceptionAction(Exception excep) {
		return new ResponseEntity<>(excep.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}