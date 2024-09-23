package event.eventscheduling.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Table("user_event")
@Data
public class UserEvent {

    @Id
    private Integer id;

    @Column("module_id")
    private Integer moduleId;

    @Column("account_id")
    private Integer accountId;

    @Column("event_id")
    private Integer eventId;

    @Column("created_date")
    private LocalDateTime createdDate;

    @Column("last_modified_date")
    private LocalDateTime lastModifiedDate;
}
