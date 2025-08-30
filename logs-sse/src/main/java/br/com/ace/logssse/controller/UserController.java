package br.com.ace.logssse.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import static net.logstash.logback.argument.StructuredArguments.kv;

@Slf4j
@RestController
public class UserController {

    @GetMapping("/create-user")
    public String createUser() {
        log.info("Novo usuário criado",
                kv("userId", "123"),
                kv("username", "luis"));
        return "Usuário criado!";
    }
}
