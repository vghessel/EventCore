package com.eventcore.controller;

import com.eventcore.domain.Event;
import com.eventcore.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/event")
public class EventController {

    private final EventService eventService;

    @PostMapping
    public ResponseEntity<Event> receiveEvent(@RequestBody Event event) {
        return ResponseEntity.ok(eventService.manageEvent(event));
    }
}
