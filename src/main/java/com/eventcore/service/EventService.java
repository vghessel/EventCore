package com.eventcore.service;

import com.eventcore.domain.Event;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    public Event manageEvent(Event event) {
        return event;
    }
}
