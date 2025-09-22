package com.eventcore.controller;

import com.eventcore.domain.Event;
import com.eventcore.dto.EventDTO;
import com.eventcore.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/event")
public class EventController {

    private final EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEVents();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Event receiveEvent(@RequestBody EventDTO eventDTO) {
        return eventService.manageEvent(eventDTO);
    }
}
