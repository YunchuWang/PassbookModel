package com.project.passbook.merchantService.model.exceptions.types;

public class ConflictException extends RuntimeException {

  public ConflictException(String message) {
    super(message);
  }
}
