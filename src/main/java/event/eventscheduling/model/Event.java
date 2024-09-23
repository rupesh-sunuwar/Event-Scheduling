package event.eventscheduling.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("event")
@Data
public class Event {

    @Id
    private Long id;

    @Column("created_by")
    private String createdBy;

    @Column("start_event_date_ad")
    private LocalDateTime startEventDateAd;

    @Column("end_event_date_ad")
    private LocalDateTime endEventDateAd;

    @Column("is_recurring")
    private boolean isRecurring;

    @Column("event_title")
    private String eventTitle;

    @Column("event_image")
    private String eventImage;

    @Column("event_status")
    private String eventStatus;

    @Column("event_description")
    private String eventDescription;

    @Column("created_date")
    private LocalDateTime createdDate;

    @Column("last_modified_date")
    private LocalDateTime lastModifiedDate;

    @Column("event_type_id")
    private Integer eventTypeId;

    @Column("is_scheduled")
    private boolean isScheduled;
}
