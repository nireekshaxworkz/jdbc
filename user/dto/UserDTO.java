package com.xworkz.user.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String phoneNo;
    private String alternateEmail;
    private String alternatePhoneNo;
    private String location;
}
