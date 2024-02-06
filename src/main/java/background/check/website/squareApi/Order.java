package background.check.website.squareApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @JsonProperty("id")
    private String id;

    @JsonProperty("location_id")
    private String locationId;

    @JsonProperty("source")
    private Source source;

    @JsonProperty("line_items")
    private List<LineItem> lineItems;

    @JsonProperty("fulfillments")
    private List<Fulfillment> fulfillments;

    @JsonProperty("net_amounts")
    private NetAmounts netAmounts;

    @JsonProperty("created_at")
    private Instant createdAt;

    @JsonProperty("updated_at")
    private Instant updatedAt;

    @JsonProperty("state")
    private OrderState state;

    @JsonProperty("version")
    private Integer version;

    @JsonProperty("total_money")
    private Money totalMoney;

    @JsonProperty("total_tax_money")
    private Money totalTaxMoney;

    @JsonProperty("total_discount_money")
    private Money totalDiscountMoney;

    @JsonProperty("total_tip_money")
    private Money totalTipMoney;

    @JsonProperty("total_service_charge_money")
    private Money totalServiceChargeMoney;

    @JsonProperty("net_amount_due_money")
    private Money netAmountDueMoney;

    public enum OrderState {
        DRAFT,
        OPEN,
        CLOSED,
        CANCELED
    }
}
