package com.pinsoft.budgettrackerbe.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    private String name;
    private String lastName;
    private String email;
    private String typeOfUse;
    private String username;
    private String Password;
}
