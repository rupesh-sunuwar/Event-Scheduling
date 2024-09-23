package event.eventscheduling.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class EventDto implements Serializable {

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("start_event_date_ad")
    private LocalDateTime startEventDateAd;

    @JsonProperty("end_event_date_ad")
    private LocalDateTime endEventDateAd;

    @JsonProperty("is_recurring")
    private boolean isRecurring;

    @JsonProperty("is_scheduled")
    private boolean isScheduled;

    @JsonProperty("event_title")
    private String eventTitle;

    @JsonProperty("event_description")
    private String eventDescription;

    @JsonProperty("event_image")
    private String eventImage;
}
