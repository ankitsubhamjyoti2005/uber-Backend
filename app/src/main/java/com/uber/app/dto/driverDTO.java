package com.uber.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class driverDTO {
    private UserDTO user;
    private  Double rating;

}
