package inventory.application.service;

import inventory.application.port.in.IProductUseCases;
import inventory.domain.model.product.ProductModel;
import inventory.domain.model.product.SubcategoryModel;

import java.util.List;

public class ProductService implements IProductUseCases {
    @Override
    public ProductModel createProduct(ProductModel product) {
        return null;
    }

    @Override
    public ProductModel updateProduct(Long productId, ProductModel product) {
        return null;
    }

    @Override
    public ProductModel activateProduct(Long productId) {
        return null;
    }

    @Override
    public ProductModel inactivateProduct(Long productId) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {
        // TODO document why this method is empty
    }

    @Override
    public List<ProductModel> findAllProducts() {
        return List.of();
    }

    @Override
    public List<ProductModel> findAllProductsBySubcategory(SubcategoryModel subcategory) {
        return List.of();
    }

    @Override
    public List<ProductModel> findProductsByName(String productName) {
        return List.of();
    }
}
