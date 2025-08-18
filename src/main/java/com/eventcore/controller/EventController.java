package com.eventcore.controller;

import com.eventcore.domain.Event;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventController {

    @PostMapping
    public ResponseEntity<Event> receiveEvent(@RequestBody Event event) {
        return ResponseEntity.ok(event);
    }
}
