package event.eventscheduling.controller;


import event.eventscheduling.model.Event;
import event.eventscheduling.request.EventDto;
import event.eventscheduling.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class EventController {

    private final EventService eventService;

    @PostMapping("api/create_event")
    public Mono<Event> createEvent(@RequestBody EventDto eventDto) {
        return eventService.createEvent(eventDto);
    }
}
