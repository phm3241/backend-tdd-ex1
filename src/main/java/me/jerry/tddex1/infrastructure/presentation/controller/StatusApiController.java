package me.jerry.tddex1.infrastructure.presentation.controller;

import me.jerry.tddex1.infrastructure.presentation.model.GenericResponse;
import me.jerry.tddex1.infrastructure.presentation.model.StatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/status")
public class StatusApiController {

    @GetMapping("/health")
    public GenericResponse<Object> health(){
        return new GenericResponse<>(
                "서버 상태",
                new StatusResponse());
    }


}
