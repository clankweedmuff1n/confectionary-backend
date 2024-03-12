package background.check.website.products.Review.controller;

import background.check.website.products.Review.Review;
import background.check.website.products.Review.ReviewRequest;
import background.check.website.products.Review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/review")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping("/create")
    private Review createReview(@RequestBody ReviewRequest reviewRequest) {
        return reviewService.createReview(reviewRequest);
    }

    @PostMapping("/create/all")
    private List<Review> createReview(@RequestBody List<ReviewRequest> reviewRequests) {
        return reviewService.createReviewAll(reviewRequests);
    }
}
