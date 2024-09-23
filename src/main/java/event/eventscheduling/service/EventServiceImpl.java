package event.eventscheduling.service;

import event.eventscheduling.enums.EventStatus;
import event.eventscheduling.model.Event;
import event.eventscheduling.repository.EventRepo;
import event.eventscheduling.request.EventDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepo eventRepo;

    @Override
    public Mono<Event> createEvent(EventDto eventDto) {

        return eventRepo.save(ofEvent(eventDto));
    }

    private Event ofEvent(EventDto eventDto) {

        Event event = new Event();
        event.setId(1L);
        event.setCreatedBy(eventDto.getCreatedBy());
        event.setStartEventDateAd(eventDto.getStartEventDateAd());
        event.setEndEventDateAd(eventDto.getEndEventDateAd());
        event.setEventImage(eventDto.getEventImage());
        event.setEventTitle(eventDto.getEventTitle());
        event.setEventStatus(String.valueOf(EventStatus.ACTIVE));
        event.setRecurring(eventDto.isRecurring());
        event.setScheduled(eventDto.isScheduled());
        event.setEventDescription(eventDto.getEventDescription());
        return event;
    }
}
