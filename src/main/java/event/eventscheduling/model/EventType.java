package event.eventscheduling.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Table("event_type")
@Data
public class EventType {

    @Id
    private Integer id;

    @Column("event_category_name")
    private String eventCategoryName;

    @Column("event_category_datail")
    private String eventCategoryDetail;

    @Column("created_date")
    private LocalDateTime createdDate;

    @Column("last_modified_date")
    private LocalDateTime lastModifiedDate;

}
