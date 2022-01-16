package me.kevinntech.gitflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventApiController {

    @GetMapping("/events")
    public List<String> getEvents() {
        return List.of("event1", "event2", "event3");
    }

}
