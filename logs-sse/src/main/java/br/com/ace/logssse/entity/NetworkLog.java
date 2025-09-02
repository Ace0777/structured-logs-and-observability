package br.com.ace.logssse.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NetworkLog {
    private String timestamp;
    private String host;
    private String level;
    private String event;
    private String sourceIp;
    private String destIp;
    private String message;
}
