package com.example.session07.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class ParentDTO {
    @NotBlank(message = "Tên phụ huynh không được để trống")
    private String name;

    @NotBlank(message = "Số điện thoại không được để trống" )
    @Pattern(
            regexp = "^0\\d{9}$",
            message = "Số điện thoại phụ huynh phải 10 số và bắt đầu bằng 0"
    )
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ParentDTO(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public ParentDTO() {
    }
}
