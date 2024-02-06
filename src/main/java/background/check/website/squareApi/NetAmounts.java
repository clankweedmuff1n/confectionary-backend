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
public class NetAmounts {
    @JsonProperty("total_money")
    private Money totalMoney;
    @JsonProperty("tax_money")
    private Money taxMoney;
    @JsonProperty("discount_money")
    private Money discountMoney;
    @JsonProperty("tip_money")
    private Money tipMoney;
    @JsonProperty("service_charge_money")
    private Money serviceChargeMoney;
}
