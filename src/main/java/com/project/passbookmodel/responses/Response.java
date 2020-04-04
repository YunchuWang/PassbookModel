package com.project.passbookmodel.responses;

import com.project.passbookmodel.codes.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

  private ErrorCode errorCode;

  private String errorMessage;

  private T data;

  public Response(T data) {
    this.data = data;
  }
}
