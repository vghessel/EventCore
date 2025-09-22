package com.eventcore.service;

import com.eventcore.domain.Event;
import com.eventcore.domain.User;
import com.eventcore.dto.EventDTO;
import com.eventcore.repository.EventRepository;
import com.eventcore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
    private final UserRepository userRepository;

    public List<Event> getAllEVents() {
        return eventRepository.findAll();
    }

    public Event manageEvent(EventDTO eventDTO) {
        Event event = new Event();
        event.setType(eventDTO.type());
        event.setIpAddress(eventDTO.ipAddress());

        User user = userRepository.findById(eventDTO.userId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        event.setUser(user);

        return eventRepository.save(event);
    }
}
