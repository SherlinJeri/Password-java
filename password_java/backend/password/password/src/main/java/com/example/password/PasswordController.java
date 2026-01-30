package com.example.password;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class PasswordController {

    @PostMapping("/generate")
    public String generatePassword(@RequestBody PasswordRequest request) {
        return PasswordGenerator.generate(
            request.getLength(),
            request.isUpper(),
            request.isLower(),
            request.isNumbers(),
            request.isSymbols()
        );
    }
}
