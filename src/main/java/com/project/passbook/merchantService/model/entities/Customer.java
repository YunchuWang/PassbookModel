package com.project.passbook.merchantService.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    // use as row key
    private String id;
    private BaseInfo baseInfo;
    private ContactInfo contactInfo;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class BaseInfo {
        private String name;
        private Integer age;
        private String sex;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ContactInfo {
        private String phone;
        private String address;
    }
}