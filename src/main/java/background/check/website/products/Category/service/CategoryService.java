package background.check.website.products.Category.service;

import background.check.website.products.Category.Category;
import background.check.website.products.Category.CategoryRequest;
import background.check.website.products.Product.Product;

import java.util.List;

public interface CategoryService {
    Category createCategory(CategoryRequest categoryRequest);
    List<Category> createCategoryAll(List<CategoryRequest> categoryRequests);
    List<Category> getAll();
    Category getByProduct(Product product);
    Category getById(Long id);
}
