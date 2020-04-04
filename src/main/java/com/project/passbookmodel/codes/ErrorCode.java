package com.project.passbookmodel.codes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {
  SUCCESS(0),
  NAMING_CONFLICT(1),
  NOT_FOUND(2);

  private final Integer code;
}
