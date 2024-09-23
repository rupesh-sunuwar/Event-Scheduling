package event.eventscheduling.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

import java.io.Serializable;

public abstract class AbstractPersist<PK extends Serializable> implements Persistable<PK> ,Serializable {

    @Id
    private PK id;
}
