package inventory.inventory.domain.port.in;

import inventory.inventory.domain.model.product.ProductModel;

import java.util.List;

public interface IProductService {
    ProductModel createProduct(ProductModel product);
    ProductModel updateProduct(ProductModel product);
    void deleteProduct(ProductModel product);
    List<ProductModel> findAllProducts();
    List<ProductModel> findAllProductsByCategory();
    List<ProductModel> findProductsByName(String productName);
}
