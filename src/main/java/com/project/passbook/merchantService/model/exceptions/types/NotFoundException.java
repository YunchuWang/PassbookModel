package com.project.passbook.merchantService.model.exceptions.types;

public class NotFoundException extends RuntimeException {

  public NotFoundException(String message) {
    super(message);
  }
}
