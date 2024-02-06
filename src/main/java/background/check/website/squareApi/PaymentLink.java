package background.check.website.squareApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentLink {
    @JsonProperty("id")
    private String id;

    @JsonProperty("version")
    private Integer version;

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("url")
    private String url;

    @JsonProperty("long_url")
    private String longUrl;

    @JsonProperty("created_at")
    private Instant createdAt;
}
