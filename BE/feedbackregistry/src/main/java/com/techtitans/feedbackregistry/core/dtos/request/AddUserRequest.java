package com.techtitans.feedbackregistry.core.dtos.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AddUserRequest {
    private String username;
    private String password;
}
