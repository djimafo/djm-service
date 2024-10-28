package com.djmcode.registration.service.auth;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class RegisterRequest
{
  @NotEmpty(message = "The firstname is required")
  @NotBlank(message = "The firstname is required")
  private String firstname;

  @NotEmpty(message = "The lastname is required")
  @NotBlank(message = "The lastname is required")
  private String lastname;

  //@NotEmpty(message = "")
  //@NotBlank(message = "")
  private Date birthday;

  @NotEmpty(message = "The e-mail address is required")
  @NotBlank(message = "The e-mail address is required")
  @Email(message = "Incorrect email format")
  private String email;

  @NotEmpty(message = "The password is required")
  @NotBlank(message = "The password is required")
  @Size(min = 4 , message = "Incorrect password format")
  private String password;
}


