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
public class SquareResponse {
    @JsonProperty("payment_link")
    private PaymentLink paymentLink;
    @JsonProperty("related_resources")
    private RelatedResources relatedResources;
}
