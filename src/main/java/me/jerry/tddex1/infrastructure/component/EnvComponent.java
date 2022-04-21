package me.jerry.tddex1.infrastructure.component;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnvComponent {

    public static String NAME = "backend-tdd";
    public static String VERSION = "0.0.0";

    private final Environment environment;

    public String getActiveProfiles(){
        return String.join(",", environment.getActiveProfiles());
    }

}
