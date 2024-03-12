package background.check.website.products.Product.service;

import background.check.website.products.Product.Product;
import background.check.website.products.Product.ProductRepository;
import background.check.website.products.Product.ProductRequest;
import background.check.website.products.Product.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    public Product createProduct(ProductRequest productRequest) {
        return productRepository.save(mapper.toProduct(productRequest));
    }

    public List<Product> createProductAll(List<ProductRequest> productRequests) {
        return productRepository.saveAll(productRequests.stream().map(mapper::toProduct).toList());
    }

    public Product getById(Long id) {
        return productRepository.findById(id)
                .orElse(null);
    }
}
