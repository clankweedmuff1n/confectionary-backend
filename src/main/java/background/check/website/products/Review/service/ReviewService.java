package background.check.website.products.Review.service;

import background.check.website.products.Review.Review;
import background.check.website.products.Review.ReviewRequest;

import java.util.List;

public interface ReviewService {
    Review createReview(ReviewRequest reviewRequest);
    List<Review> createReviewAll(List<ReviewRequest> reviewRequests);
}
