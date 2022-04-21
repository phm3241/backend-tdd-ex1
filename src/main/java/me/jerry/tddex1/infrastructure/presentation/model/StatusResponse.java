package me.jerry.tddex1.infrastructure.presentation.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import me.jerry.tddex1.infrastructure.component.EnvComponent;

import java.time.LocalDateTime;

@Getter @Setter
public class StatusResponse {

    private String name;
    private String version;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss z", timezone = "Asia/Seoul")
    private LocalDateTime timestamp;

    public StatusResponse() {
        this.name = EnvComponent.NAME;
        this.version = EnvComponent.VERSION;
        this.timestamp = LocalDateTime.now();
    }
}
