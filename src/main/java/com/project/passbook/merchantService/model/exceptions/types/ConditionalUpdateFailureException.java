package com.project.passbook.merchantService.model.exceptions.types;

public class ConditionalUpdateFailureException extends RuntimeException {

  public ConditionalUpdateFailureException(String message) {
    super(message);
  }
}
