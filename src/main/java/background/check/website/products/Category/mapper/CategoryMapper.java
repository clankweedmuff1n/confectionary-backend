package background.check.website.products.Category.mapper;

import background.check.website.products.Category.Category;
import background.check.website.products.Category.CategoryRequest;
import background.check.website.products.GalleryItem.GalleryItemRepository;
import background.check.website.products.Product.ProductRepository;
import background.check.website.products.Review.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryMapper {
    /*private final GalleryItemMapper galleryItemMapper;
    private final ProductMapper productMapper;
    private final ReviewMapper reviewMapper;*/

    private final GalleryItemRepository galleryItemRepository;
    private final ProductRepository productRepository;
    private final ReviewRepository reviewRepository;

    public Category toCategory(CategoryRequest categoryRequest) {
        return Category.builder()
                .name(categoryRequest.getName())
                .description(categoryRequest.getDescription())
                .gallery(galleryItemRepository.findAllById(categoryRequest.getGallery()))
                .preview(categoryRequest.getPreviewImage() != null ? galleryItemRepository.findById(categoryRequest.getPreviewImage())
                        .orElse(null) : null)
                .products(productRepository.findAllById(categoryRequest.getProducts()))
                .reviews(reviewRepository.findAllById(categoryRequest.getReviews()))

                /*.gallery(categoryRequest.getGallery().stream().map(galleryItemMapper::toGalleryItem).toList())
                .preview(galleryItemMapper.toGalleryItem(categoryRequest.getPreviewImage()))
                .products(categoryRequest.getProducts().stream().map(productMapper::toProduct).toList())
                .reviews(categoryRequest.getReviews().stream().map(reviewMapper::toReview).toList())*/

                .build();
    }
}
