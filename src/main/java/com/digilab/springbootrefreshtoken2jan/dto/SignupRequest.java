package com.digilab.springbootrefreshtoken2jan.dto;

import java.util.Set;

import jakarta.validation.constraints.*;

public class SignupRequest {

    @NotBlank
    @Size(min = 4, max = 20, message = "Username must be between 4 and 20 characters")
    private String username;

    @NotBlank
    @Size(min = 4, max = 50, message = "Email must be between 4 and 50 characters")
    @Email(message = "Invalid email format")
    private String email;

    private Set<String> roles;

    @NotBlank
    @Size(min = 4, max = 120, message = "Password must be between 4 and 120 characters")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return this.roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}