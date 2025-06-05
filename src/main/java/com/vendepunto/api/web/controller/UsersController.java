
package com.vendepunto.api.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/list")
    public String index() {
        return "Listado de usuarios 2";    // Asegúrate de usar comillas dobles para strings
    }
}