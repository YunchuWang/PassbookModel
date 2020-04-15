package com.project.passbook.merchantService.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Merchant {

  private Integer id;

  private String name;

  private String logoUrl;

  private String businessLicenseUrl;

  private String phone;

  private String address;

  private boolean isAudit;
}
