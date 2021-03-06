package br.com.rogerio.demo.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	private List<FiedMessage> errors = new ArrayList<>();

	public ValidationError() {
		super();

	}

	public ValidationError(Long timestamp, Integer status, String error) {
		super(timestamp, status, error);
	}

	public List<FiedMessage> getErrors() {
		return errors;
	}

	public void addErrors(String fieldName, String message) {
		this.errors.add(new FiedMessage(fieldName, message));
	}

}
