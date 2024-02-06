package background.check.website.squareApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Fulfillment {
    @JsonProperty("uid")
    private String uid;

    @JsonProperty("type")
    private FulfillmentType type;

    @JsonProperty("state")
    private FulfillmentState state;

    enum FulfillmentType {
        DIGITAL,
        PHYSICAL
    }

    enum FulfillmentState {
        PROPOSED,
        FULFILLED,
        CANCELED
    }
}
