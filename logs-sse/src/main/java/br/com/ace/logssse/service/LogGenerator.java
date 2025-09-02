package br.com.ace.logssse.service;

import br.com.ace.logssse.entity.NetworkLog;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Random;

@Service
public class LogGenerator {

    private final Random random = new Random();
    private final String[] hosts = {"server-1", "server-2", "server-3"};
    private final String[] levels = {"INFO", "WARN", "ERROR"};
    private final String[] messages = {
            "Pacote recebido",
            "Pacote enviado",
            "Conexão perdida",
            "CPU crítica",
            "Memória alta",
            "Serviço HTTP lento",
            "Latência de rede alta"
    };

    public NetworkLog generate() {
        String host = hosts[random.nextInt(hosts.length)];
        String level = levels[random.nextInt(levels.length)];
        String message = messages[random.nextInt(messages.length)];

        ***REMOVED***
        if (message.contains("CPU")) {
            message += " (" + (random.nextInt(30) + 60) + "%)";
        } else if (message.contains("Memória")) {
            message += " (" + (random.nextInt(30) + 60) + "%)";
        } else if (message.contains("Latência")) {
            message += " (" + (random.nextInt(100) + 50) + "ms)";
        }

        String sourceIp = "192.168.1." + (random.nextInt(100) + 1);
        String destIp = "192.168.1." + (random.nextInt(100) + 1);

        return new NetworkLog(
                Instant.now().toString(),
                host,
                level,
                "NETWORK_EVENT",
                sourceIp,
                destIp,
                message
        );
    }

}
