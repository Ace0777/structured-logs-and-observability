    package br.com.ace.logssse.config;

    import br.com.ace.logssse.controller.LogSseController;
    import jakarta.annotation.PostConstruct;
    import ch.qos.logback.classic.Logger;
    import org.slf4j.LoggerFactory;

    public class LogbackSseConfig {

        private final LogSseController logSseController;

        public LogbackSseConfig(LogSseController logSseController) {
            this.logSseController = logSseController;
        }

        @PostConstruct
        public void initSseAppender() {
            Logger rootLogger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);

            SseLogAppender sseAppender = new SseLogAppender();
            sseAppender.setSseController(logSseController);
            sseAppender.setContext(rootLogger.getLoggerContext());
            sseAppender.start();

            rootLogger.addAppender(sseAppender);

        }

    }
