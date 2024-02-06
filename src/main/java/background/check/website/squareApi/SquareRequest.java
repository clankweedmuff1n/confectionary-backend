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
public class SquareRequest {
    @JsonProperty("idempotency_key")
    private String idempotencyKey;

    @JsonProperty("quick_pay")
    private QuickPay quickPay;
}
