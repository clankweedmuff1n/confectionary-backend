package background.check.website.products.Review;

import background.check.website.products.Category.Category;
import background.check.website.products.Product.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_reviews")
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    /*@ManyToOne
    @JoinColumn(name = "user_id")
    private User author;*/
    private String author;
    @Column(length = 2048)
    private String description;
    @JsonProperty("avatar")
    private String avatarUrl;
    @CreationTimestamp
    private Date date;
    @Enumerated(EnumType.STRING)
    private RateType rate;
    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnore
    private Category category;
    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonIgnore
    private Product product;
}
