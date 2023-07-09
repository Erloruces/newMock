package com.example.newMock.Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseDTO {

    private String rqUID;
    private String clientId;
    private String account;
    private String currency;
    private String balance;
    private String maxLimit;
}
