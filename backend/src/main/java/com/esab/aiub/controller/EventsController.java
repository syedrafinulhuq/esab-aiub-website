package com.esab.aiub.controller;

import com.esab.aiub.model.Event;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins = "http://localhost:3000")
public class EventsController {
    @GetMapping
    public List<Event> getAllEvents() {
        return Arrays.asList(
            new Event(1L, "Tech for Society", "2024-06-10", "AIUB Auditorium"),
            new Event(2L, "Innovation Fair", "2024-07-01", "Campus Field")
        );
    }
}