package background.check.website.products.Review.mapper;

import background.check.website.products.Category.CategoryRepository;
import background.check.website.products.Category.service.CategoryService;
import background.check.website.products.Product.ProductRepository;
import background.check.website.products.Product.service.ProductService;
import background.check.website.products.Review.Review;
import background.check.website.products.Review.ReviewRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReviewMapper {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public Review toReview(ReviewRequest reviewRequest) {
        return Review.builder()
                .author(reviewRequest.getAuthor())
                .rate(reviewRequest.getRate())
                .avatarUrl(reviewRequest.getAvatarUrl())
                .category(reviewRequest.getCategoryId() != null ? categoryRepository.findById(reviewRequest.getCategoryId())
                        .orElse(null) : null)
                .description(reviewRequest.getDescription())
                .product(reviewRequest.getProductId() != null ? productRepository.findById(reviewRequest.getProductId())
                        .orElse(null) : null)
                .build();
    }
}
