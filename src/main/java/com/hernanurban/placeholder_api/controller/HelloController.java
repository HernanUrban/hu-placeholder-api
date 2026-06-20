package com.hernanurban.placeholder_api.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        log.info("Hello World!");
        HelloMessage message = new HelloMessage("Hello World!");
        return ResponseEntity.ok(message);
    }
}

@Data
@AllArgsConstructor
class HelloMessage{
    public String message;

}