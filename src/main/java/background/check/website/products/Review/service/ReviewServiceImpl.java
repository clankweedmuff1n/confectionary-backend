package background.check.website.products.Review.service;

import background.check.website.products.Review.Review;
import background.check.website.products.Review.ReviewRepository;
import background.check.website.products.Review.ReviewRequest;
import background.check.website.products.Review.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;
    private final ReviewMapper mapper;

    public Review createReview(ReviewRequest reviewRequest) {
        return reviewRepository.save(mapper.toReview(reviewRequest));
    }

    public List<Review> createReviewAll(List<ReviewRequest> reviewRequests) {
        return reviewRepository.saveAll(reviewRequests.stream().map(mapper::toReview).toList());
    }
}
