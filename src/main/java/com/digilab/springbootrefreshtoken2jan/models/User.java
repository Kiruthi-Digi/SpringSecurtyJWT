package com.digilab.springbootrefreshtoken2jan.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Document(collection = "users")
public class User {
    @Id
    private String id;

    @NotBlank
    @Size(min = 4, max = 20, message = "Username must be between 4 and 20 characters")
    private String username;

    @NotBlank
    @Size(min = 4, max = 50, message = "Email must be between 4 and 50 characters")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank
    @Size(min = 4, max = 120, message = "Password must be between 4 and 120 characters")
    private String password;

    private Set<Role> roles = new HashSet<>();

    // Constructors, getters, setters

    public User() {

    }

    public User(
            @NotBlank @Size(min = 4, max = 20, message = "Username must be between 4 and 20 characters") String username,
            @NotBlank @Size(min = 4, max = 50, message = "Email must be between 4 and 50 characters") @Email(message = "Invalid email format") String email,
            @NotBlank @Size(min = 4, max = 120, message = "Password must be between 4 and 120 characters") String password) {

        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(
            @NotBlank @Size(min = 4, max = 20, message = "Username must be between 4 and 20 characters") String username,
            @NotBlank @Size(min = 4, max = 50, message = "Email must be between 4 and 50 characters") @Email(message = "Invalid email format") String email,
            @NotBlank @Size(min = 4, max = 120, message = "Password must be between 4 and 120 characters") String password,
            Set<Role> roles) {

        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public User(String id,
            @NotBlank @Size(min = 4, max = 20, message = "Username must be between 4 and 20 characters") String username,
            @NotBlank @Size(min = 4, max = 50, message = "Email must be between 4 and 50 characters") @Email(message = "Invalid email format") String email,
            @NotBlank @Size(min = 4, max = 120, message = "Password must be between 4 and 120 characters") String password,
            Set<Role> roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}
