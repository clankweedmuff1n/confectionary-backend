package background.check.website.products.Category.service;

import background.check.website.products.Category.Category;
import background.check.website.products.Category.CategoryRepository;
import background.check.website.products.Category.CategoryRequest;
import background.check.website.products.Category.mapper.CategoryMapper;
import background.check.website.products.GalleryItem.GalleryItem;
import background.check.website.products.GalleryItem.GalleryItemRepository;
import background.check.website.products.Product.Product;
import background.check.website.products.Product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final GalleryItemRepository galleryItemRepository;
    private final CategoryMapper mapper;

    //@PostConstruct
    private void init() {
        Category category = Category.builder()
                .description("best category")
                .name("tarts")
                .build();

        category = categoryRepository.save(category);


        List<GalleryItem> savedGallery = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            GalleryItem galleryItem = GalleryItem.builder()
                    .category(category)
                    .imageUrl("THIS IS IMAGE URL " + i)
                    .build();
            savedGallery.add(galleryItemRepository.save(galleryItem));
        }

        Product product = Product.builder()
                .name("chocolate tart")
                .price(100L)
                .category(category)
                .productType("tart")
                .preview(savedGallery.get(2))
                .gallery(savedGallery)
                .description("the best chocolate tart")
                .build();

        product = productRepository.save(product);

        System.out.println(product);
    }

    public List<Category> getAll() {
        return null;
    }

    public Category getByProduct(Product product) {
        return null;
    }

    public Category getById(Long id) {
        return categoryRepository.findById(id)
                .orElse(null);
    }

    public Category createCategory(CategoryRequest categoryRequest) {
        return categoryRepository.save(mapper.toCategory(categoryRequest));
    }

    public List<Category> createCategoryAll(List<CategoryRequest> categoryRequests) {
        return categoryRepository.saveAll(categoryRequests.stream().map(mapper::toCategory).toList());
    }
}
