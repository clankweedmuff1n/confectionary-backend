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
public class QuickPay {
    @JsonProperty("name")
    private String name;

    @JsonProperty("price_money")
    private Money priceMoney;

    @JsonProperty("location_id")
    private String locationId;
}
