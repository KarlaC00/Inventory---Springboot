package inventory.application.port.out;

import inventory.domain.model.enums.Status;
import inventory.domain.model.product.ProductModel;
import inventory.domain.model.product.SubcategoryModel;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    ProductModel save(ProductModel productModel);
    Optional<ProductModel> findByName(String productName);
    List<ProductModel> findAll();
    List<ProductModel> findProductsBySubcategory(SubcategoryModel subcategory);
    List<ProductModel> findByStatus(Status status);
}
