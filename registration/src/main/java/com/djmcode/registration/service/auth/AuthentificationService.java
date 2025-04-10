package com.djmcode.registration.service.auth;

import jakarta.mail.MessagingException;

public interface AuthentificationService
{
  void registration(RegisterRequest request) throws MessagingException;

  AuthResponse authentication(AuthRequest request);

  void activateAccount(String token) throws MessagingException;
}
