package background.check.website.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterCompleteRequest {

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("middle_name")
    private String middleName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("date")
    private Date date;

    @JsonProperty("ssn")
    private String ssn;

    @JsonProperty("primary_phone")
    private String primaryPhone;

    @JsonProperty("alternative_phone")
    private String alternativePhone;

    @JsonProperty("second_alternative_phone")
    private String secondAlternativePhone;

    @JsonProperty("address")
    private String address;

    @JsonProperty("address_second_line")
    private String addressSecondLine;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("zip")
    private String zip;

    @JsonProperty("income")
    private Integer income;

    @JsonProperty("incomeType")
    private String incomeType;

    @JsonProperty("otherIncome")
    private Integer otherIncome;

    @JsonProperty("otherIncomeType")
    private String otherIncomeType;

    @JsonProperty("assets")
    private Integer assets;

    @JsonProperty("status")
    private String status;
}