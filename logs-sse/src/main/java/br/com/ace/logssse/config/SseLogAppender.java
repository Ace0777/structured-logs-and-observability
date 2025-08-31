package br.com.ace.logssse.config;

import br.com.ace.logssse.controller.LogSseController;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import lombok.Setter;
import net.logstash.logback.encoder.LogstashEncoder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class SseLogAppender extends AppenderBase<ILoggingEvent> {

    @Setter
    private LogSseController sseController;
    private final LogstashEncoder encoder = new LogstashEncoder();


    @Override
    protected void append(ILoggingEvent event) {
        if (sseController == null) return;

        String json = new String(encoder.encode(event), StandardCharsets.UTF_8);
        System.out.println("Enviando log para SSE: " + json); // <- debug
        sseController.sendLog(json);
    }
}
