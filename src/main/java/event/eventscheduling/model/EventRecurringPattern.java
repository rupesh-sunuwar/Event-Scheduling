package event.eventscheduling.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Table("event_recurring_pattern")
@Data
public class EventRecurringPattern {

    @Id
    private Integer id;

    @Column("user_event_id")
    private Integer userEventId;

    @Column("admin_event_id")
    private Integer adminEventId;

    @Column("recurring_type_id")
    private Integer recurringTypeId;

    @Column("separation_count")
    private Integer separationCount;

    @Column("max_num_of_occurrences")
    private Integer maxNumOfOccurrences;

    @Column("day_of_week")
    private Integer dayOfWeek;

    @Column("week_of_month")
    private Integer weekOfMonth;

    @Column("day_of_month")
    private Integer dayOfMonth;

    @Column("month_of_year")
    private Integer monthOfYear;

    @Column("created_date")
    private LocalDateTime createdDate;

    @Column("last_modified_date")
    private LocalDateTime lastModifiedDate;

    // Getters and Setters
}

