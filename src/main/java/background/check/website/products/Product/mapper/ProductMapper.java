package background.check.website.products.Product.mapper;

import background.check.website.products.Category.CategoryRepository;
import background.check.website.products.GalleryItem.GalleryItemRepository;
import background.check.website.products.Product.Product;
import background.check.website.products.Product.ProductRequest;
import background.check.website.products.Review.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductMapper {
    /*private final GalleryItemMapper galleryItemMapper;
    private final ReviewMapper reviewMapper;*/
    private final CategoryRepository categoryRepository;

    private final GalleryItemRepository galleryItemRepository;
    private final ReviewRepository reviewRepository;

    public Product toProduct(ProductRequest productRequest) {
        return Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .productType(productRequest.getProductType())
                .gallery(galleryItemRepository.findAllById(productRequest.getGallery()))
                .price(productRequest.getPrice())
                .preview(productRequest.getPreview() != null ? galleryItemRepository.findById(productRequest.getPreview())
                        .orElse(null) : null)
                .reviews(reviewRepository.findAllById(productRequest.getReviews()))

                .category(productRequest.getCategoryId() != null ? categoryRepository.findById(productRequest.getCategoryId())
                        .orElse(null) : null)
                /*.reviews(productRequest.getReviews().stream().map(reviewMapper::toReview).toList())
                .preview(galleryItemMapper.toGalleryItem(productRequest.getPreview()))
                .gallery(productRequest.getGallery().stream().map(galleryItemMapper::toGalleryItem).toList())*/

                .build();
    }
}
