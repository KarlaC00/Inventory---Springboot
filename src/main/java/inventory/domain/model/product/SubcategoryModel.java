package inventory.domain.model.product;

import inventory.domain.model.enums.Status;
import inventory.infrastructure.persistence.entity.product.SubcategoryEntity;

import java.util.List;

public class SubcategoryModel {
    private Long subCategoryId;
    private String subCategoryName;
    private Status subCategoryStatus;

    private List<ProductModel> products;
    private CategoryModel category;
}
