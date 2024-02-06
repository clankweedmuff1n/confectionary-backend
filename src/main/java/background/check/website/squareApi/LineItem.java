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
public class LineItem {
    @JsonProperty("uid")
    private String uid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("item_type")
    private ItemType itemType;

    @JsonProperty("base_price_money")
    private Money basePriceMoney;

    @JsonProperty("variation_total_price_money")
    private Money variationTotalPriceMoney;

    @JsonProperty("gross_sales_money")
    private Money grossSalesMoney;

    @JsonProperty("total_tax_money")
    private Money totalTaxMoney;

    @JsonProperty("total_discount_money")
    private Money totalDiscountMoney;

    @JsonProperty("total_money")
    private Money totalMoney;

    @JsonProperty("total_service_charge_money")
    private Money totalServiceChargeMoney;

    public enum ItemType {
        ITEM,
        REFUND
    }
}
