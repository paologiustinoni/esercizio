package it.mytest.esercizio.handler;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.mytest.esercizio.error.Error;
import it.mytest.esercizio.error.ErrorResponsePost;
import it.mytest.esercizio.error.InvalidDataException;
import it.mytest.esercizio.error.Payload;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

	private static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandler.class);
	
	@Value("${accountId}")
	String accountId;
	
    @org.springframework.web.bind.annotation.ExceptionHandler(HttpClientErrorException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponsePost> handleBadRequest(HttpClientErrorException exception) {
    	LOGGER.error("handleBadRequest called...");

    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	String responseBodyAsString = exception.getResponseBodyAsString();
    	try {
			ErrorResponsePost errorResponse = objectMapper.readValue(responseBodyAsString, ErrorResponsePost.class);
			if (errorResponse != null) {
				List<Error> errors = errorResponse.getErrors();
				if (errors.size() == 1 && errors.get(0).getCode().equalsIgnoreCase("API000")) {
					Error error = new Error();
					error.setCode("API000");
					error.setDescription("Errore tecnico  La condizione BP049 non e' prevista per il conto id "+ accountId);
					errorResponse.setErrors(Collections.singletonList(error));
				}
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse); 
			}
			
		} catch (JsonProcessingException e) {
			LOGGER.error("{}, {}", e, e.getMessage());
		}
    	
    	return null;
    }
    
    @org.springframework.web.bind.annotation.ExceptionHandler(InvalidDataException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<InvalidDataException> handleInvalidDateRequest(InvalidDataException exception) {
    	LOGGER.error("handleInvalidDateRequest called...");
    	
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception); 
    }
    
	
}
