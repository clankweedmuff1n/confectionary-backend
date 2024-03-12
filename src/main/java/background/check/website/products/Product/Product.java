package background.check.website.products.Product;

import background.check.website.products.Category.Category;
import background.check.website.products.GalleryItem.GalleryItem;
import background.check.website.products.Review.Review;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_products")
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String productType;
    private Long price;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnore
    private Category category;
    @OneToMany(mappedBy = "product")
    private List<GalleryItem> gallery;
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
    @OneToOne(mappedBy = "product")
    private GalleryItem preview;
}
