package background.check.website.products.Product.service;

import background.check.website.products.Product.Product;
import background.check.website.products.Product.ProductRequest;

import java.util.List;

public interface ProductService {
    Product createProduct(ProductRequest productRequest);
    List<Product> createProductAll(List<ProductRequest> productRequests);
    Product getById(Long id);

}
