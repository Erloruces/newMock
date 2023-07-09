package com.example.newMock.Model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RequestDTO {

    private String rqUID;
    private String clientId;
    private String account;
    private String openDate;
    private String closeDate;
}
