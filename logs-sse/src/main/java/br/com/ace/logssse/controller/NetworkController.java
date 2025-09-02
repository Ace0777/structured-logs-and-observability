package br.com.ace.logssse.controller;

import br.com.ace.logssse.entity.NetworkLog;
import br.com.ace.logssse.service.LogGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Random;

@Slf4j
@RestController
public class NetworkController {

    private final LogGenerator logGenerator;
    private final LogSseController logSseController;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public NetworkController(LogGenerator logGenerator, LogSseController logSseController) {
        this.logGenerator = logGenerator;
        this.logSseController = logSseController;
    }

    @Scheduled(fixedRate = 5000) ***REMOVED***
    public void generateFakeNetworkLog() throws JsonProcessingException {
        NetworkLog logEntry = logGenerator.generate();

        ***REMOVED***
        String jsonLog = objectMapper.writeValueAsString(logEntry);

        ***REMOVED***
        logSseController.sendLog(jsonLog);

        ***REMOVED***
        log.info("[{}][{}] {} -> {} : {}",
                logEntry.getHost(),
                logEntry.getLevel(),
                logEntry.getSourceIp(),
                logEntry.getDestIp(),
                logEntry.getMessage()
        );
    }

}
