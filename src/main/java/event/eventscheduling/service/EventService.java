package event.eventscheduling.service;

import event.eventscheduling.model.Event;
import event.eventscheduling.request.EventDto;
import reactor.core.publisher.Mono;

public interface EventService {

    Mono<Event> createEvent(EventDto eventDto);
}
