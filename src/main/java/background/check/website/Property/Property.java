package background.check.website.Property;

import background.check.website.token.Token;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="_property")
public class Property {
    @Id
    @GeneratedValue
    private Integer id;
    @OneToMany(mappedBy = "property")
    private List<Image> images;
    private Integer price;
    private String address;
}
