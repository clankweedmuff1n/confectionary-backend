package background.check.website.confirmLink;

import background.check.website.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="_link")
public class ConfirmLink {
    @Id
    @GeneratedValue
    private  Integer id;
    private String link;
    @OneToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;
}