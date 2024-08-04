package project.todo_management.service;

import project.todo_management.dto.JwtAuthResponse;
import project.todo_management.dto.LoginDto;
import project.todo_management.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    JwtAuthResponse login(LoginDto loginDto);
}
