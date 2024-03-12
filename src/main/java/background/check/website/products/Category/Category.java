package background.check.website.products.Category;

import background.check.website.products.GalleryItem.GalleryItem;
import background.check.website.products.Product.Product;
import background.check.website.products.Review.Review;
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
@Table(name="_category")
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @OneToOne(mappedBy = "category")
    private GalleryItem preview;
    @OneToMany(mappedBy = "category")
    private List<GalleryItem> gallery;
    @OneToMany(mappedBy = "category")
    private List<Review> reviews;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
