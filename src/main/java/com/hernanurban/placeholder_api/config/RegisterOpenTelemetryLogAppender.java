package com.hernanurban.placeholder_api.config;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.instrumentation.logback.appender.v1_0.OpenTelemetryAppender;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
class RegisterOpenTelemetryLogAppender implements InitializingBean {

    private final OpenTelemetry openTelemetry;

    public RegisterOpenTelemetryLogAppender(OpenTelemetry openTelemetry) {
        this.openTelemetry = openTelemetry;
    }

    @Override
    public void afterPropertiesSet() {
        // Wire the active OpenTelemetry instance into the static Logback appender context
        OpenTelemetryAppender.install(this.openTelemetry);
    }
}
