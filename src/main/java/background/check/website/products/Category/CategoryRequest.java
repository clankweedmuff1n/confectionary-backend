package background.check.website.products.Category;

import background.check.website.products.GalleryItem.GalleryItemRequest;
import background.check.website.products.Product.ProductRequest;
import background.check.website.products.Review.ReviewRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequest {
    private String name;
    private String description;
    @JsonProperty("preview")
    private Long previewImage;
    private List<Long> gallery;
    private List<Long> products;
    private List<Long> reviews;
    /*private GalleryItemRequest previewImage;
    private List<GalleryItemRequest> gallery;
    private List<ProductRequest> products;
    private List<ReviewRequest> reviews;*/
}
