package com.projeto.spring.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlers {

	public String usuarioNaoEncontrado (Exception ex) {
		return ex.getMessage();
	}

	@ControllerAdvice
	public class ExceptionHandlers {
		public String usuarioNaoEncontrado(Exception ex) {
			return ex.getMessage();
		}
	}
	
	@ControllerAdvice
	public class ExceptionHandlers { 
		
	}
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	@ExceptionHandler(Exception.class)
	public String usuarioNaoEncontrado1(Exception ex) {
		return ex.getMessage();
	}
	}
	
	

