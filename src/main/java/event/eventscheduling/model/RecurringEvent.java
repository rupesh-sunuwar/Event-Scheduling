package event.eventscheduling.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Table("recurring_event")
@Data
public class RecurringEvent {

    @Id
    private Integer id;

    @Column("createdBy_id")
    private Integer createdById;

    @Column("start_date")
    private LocalDateTime startDate;

    @Column("start_time")
    private LocalDateTime startTime;

    @Column("end_time")
    private LocalDateTime endTime;

    @Column("end_date")
    private LocalDateTime endDate;

    @Column("is_full_date_event")
    private Boolean isFullDateEvent;

    @Column("event_id")
    private Integer eventId;

    @Column("created_date")
    private LocalDateTime createdDate;

    @Column("last_modified_date")
    private LocalDateTime lastModifiedDate;

}
