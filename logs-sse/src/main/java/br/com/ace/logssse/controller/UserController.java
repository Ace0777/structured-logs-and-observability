package br.com.ace.logssse.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    private final LogSseController logSseController;

    public UserController(LogSseController logSseController) {
        this.logSseController = logSseController;
    }

    @GetMapping("/create-user")
    public String createUser() {
        String jsonLog = """
        {
            "timestamp":"%s",
            "level":"INFO",
            "message":"Novo usuário criado",
            "userId":"123",
            "username":"luis"
        }
        """.formatted(java.time.Instant.now());

        log.info("Novo usuário criado");
        logSseController.sendLog(jsonLog);
        return "Usuário criado!";
    }
}

