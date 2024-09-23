package event.eventscheduling.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Table("admin_event")
@Data
public class AdminEvent {

    @Id
    private Integer id;

    @Column("enable_commission_profile_event")
    private Boolean enableCommissionProfileEvent;

    @Column("createdBy_id")
    private Integer createdById;

    @Column("user_type")
    private String userType;

    @Column("event_id")
    private Integer eventId;

    @Column("created_date")
    private LocalDateTime createdDate;

    @Column("last_modified_date")
    private LocalDateTime lastModifiedDate;
}
