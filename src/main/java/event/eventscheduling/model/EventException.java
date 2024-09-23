package event.eventscheduling.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Table("event_exception")
@Data
public class EventException {

    @Id
    private Integer id;

    @Column("user_event_id")
    private Integer userEventId;

    @Column("admin_event_id")
    private Integer adminEventId;

    @Column("is_rescheduled")
    private String isRescheduled;

    @Column("is_cancelled")
    private String isCancelled;

    @Column("start_date")
    private LocalDateTime startDate;

    @Column("end_date")
    private LocalDateTime endDate;

    @Column("start_time")
    private LocalDateTime startTime;

    @Column("end_time")
    private LocalDateTime endTime;

    @Column("is_full_day_event")
    private String isFullDayEvent;

    @Column("created_date")
    private LocalDateTime createdDate;

    @Column("last_modified_date")
    private LocalDateTime lastModifiedDate;

}
