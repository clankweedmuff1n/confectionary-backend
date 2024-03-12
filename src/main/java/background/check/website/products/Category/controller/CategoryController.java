package background.check.website.products.Category.controller;

import background.check.website.products.Category.Category;
import background.check.website.products.Category.CategoryRequest;
import background.check.website.products.Category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping("/create")
    private Category createCategory(@RequestBody CategoryRequest categoryRequest) {
        return categoryService.createCategory(categoryRequest);
    }

    @PostMapping("/create/all")
    private List<Category> createCategory(@RequestBody List<CategoryRequest> categoryRequests) {
        return categoryService.createCategoryAll(categoryRequests);
    }
}
