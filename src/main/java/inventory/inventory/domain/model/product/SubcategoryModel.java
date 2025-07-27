package inventory.inventory.domain.model.product;

import inventory.inventory.domain.model.enums.Status;

public class SubcategoryModel {
    private Long categoryId;
    private String categoryName;
    private Status categoryStatus;

    private CategoryModel category;
}
