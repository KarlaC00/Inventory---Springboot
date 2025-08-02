package inventory.application.port.in;

import inventory.domain.model.product.ProductModel;
import inventory.domain.model.product.SubcategoryModel;

import java.util.List;

public interface IProductUseCases {
    ProductModel createProduct(ProductModel product);
    ProductModel updateProduct(Long productId, ProductModel product);
    ProductModel activateProduct(Long productId);
    ProductModel inactivateProduct(Long productId);
    void deleteProduct(Long productId);
    List<ProductModel> findAllProducts();
    List<ProductModel> findAllProductsBySubcategory(SubcategoryModel subcategory);
    List<ProductModel> findProductsByName(String productName);
}
