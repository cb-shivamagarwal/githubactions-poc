package com.example.springbootdocker.exceptions;

/**
 * Exception Class for Invalid Transaction reference.
 */
public class InvalidTransactionReferenceException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public InvalidTransactionReferenceException(String errorMessage) {
    super(errorMessage);
  }

}
