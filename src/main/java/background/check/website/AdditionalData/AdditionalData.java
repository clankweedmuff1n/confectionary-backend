package background.check.website.AdditionalData;

import background.check.website.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="_additional_data")
public class AdditionalData {
    @Id
    @GeneratedValue
    private  Integer id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("middle_name")
    private String middleName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email")
    @Column(unique = true)
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

    @JsonProperty("user")
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
