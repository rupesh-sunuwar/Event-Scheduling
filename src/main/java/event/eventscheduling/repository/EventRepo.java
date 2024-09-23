package event.eventscheduling.repository;

import event.eventscheduling.model.Event;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends ReactiveCrudRepository<Event, Integer> {
}
