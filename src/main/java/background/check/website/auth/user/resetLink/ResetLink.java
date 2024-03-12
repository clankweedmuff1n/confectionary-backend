package background.check.website.auth.user.resetLink;

import background.check.website.auth.user.User;
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
@Table(name="_res_link")
public class ResetLink {
    @Id
    @GeneratedValue
    private  Integer id;
    private String link;
    @OneToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;
}