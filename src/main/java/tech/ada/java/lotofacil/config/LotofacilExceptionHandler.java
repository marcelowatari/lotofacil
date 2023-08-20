package tech.ada.java.lotofacil.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import tech.ada.java.lotofacil.exception.LotofacilExceptionPadrao;

@ControllerAdvice
public class LotofacilExceptionHandler {

	@ExceptionHandler({MethodArgumentNotValidException.class})
	public ResponseEntity<LotofacilExceptionPadrao> validationError(MethodArgumentNotValidException e) {
		LotofacilExceptionPadrao lotofacilExceptionPadrao = new LotofacilExceptionPadrao ();
		lotofacilExceptionPadrao.setMensagem( e.getFieldError().getDefaultMessage() );
		lotofacilExceptionPadrao.setHttpStatusCode( HttpStatus.BAD_REQUEST.value() );
		e.getFieldError().getCode();
		return new ResponseEntity<> (lotofacilExceptionPadrao, HttpStatus.BAD_REQUEST );
		
	}
}
