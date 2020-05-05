package com.project.passbook.merchantService.model.exceptions.types;

public class BadRequestException extends RuntimeException {

  public BadRequestException(String message) {
    super(message);
  }
}
