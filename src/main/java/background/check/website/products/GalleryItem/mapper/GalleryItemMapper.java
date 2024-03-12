package background.check.website.products.GalleryItem.mapper;

import background.check.website.products.Category.CategoryRepository;
import background.check.website.products.GalleryItem.GalleryItem;
import background.check.website.products.GalleryItem.GalleryItemRequest;
import background.check.website.products.Product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GalleryItemMapper {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public GalleryItem toGalleryItem(GalleryItemRequest galleryItemRequest) {
        return GalleryItem.builder()
                .imageUrl(galleryItemRequest.getImageUrl())
                .category(galleryItemRequest.getCategoryId() != null ? categoryRepository.findById(galleryItemRequest.getCategoryId())
                        .orElse(null) : null)
                .product(galleryItemRequest.getProductId() != null ? productRepository.findById(galleryItemRequest.getProductId())
                        .orElse(null) : null)
                .build();
    }
}
