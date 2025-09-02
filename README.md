<img width="2559" height="1393" alt="{BFC4BCCA-5F18-4DD0-855B-0435FCE8761F}" src="https://github.com/user-attachments/assets/1029a5a5-6889-4d18-97ae-382eafa4a48b" />
<img width="2557" height="1182" alt="monitorar o uso de memória máximo de cada servidor ao longo do tempo" src="https://github.com/user-attachments/assets/ba1dfbb2-eec4-4a38-9fce-8e5d323181ca" />

Tecnologias Utilizadas

Java 17 / Spring Boot

Logback + LogstashEncoder

Server-Sent Events (SSE) para streaming instantâneo

Promtail para envio de logs ao Loki

Loki como armazenamento e indexação de logs

Grafana para dashboards e visualização

Front-end simples em HTML/JS para logs em tempo real


Funcionalidades

Gráficos e logs em tempo real via SSE

Front-end customizado recebe logs instantaneamente e exibe em painel.

Permite visualizar eventos de rede ou aplicação imediatamente, com cores por nível (INFO, WARN, ERROR).

Monitoramento contínuo via Grafana

Logs lidos pelo Promtail e enviados ao Loki.

Grafana consome os logs e gera dashboards em tempo real, incluindo gráficos de quantidade de logs por nível, host ou qualquer campo.
