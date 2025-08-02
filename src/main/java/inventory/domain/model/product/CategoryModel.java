package inventory.domain.model.product;

import inventory.domain.model.enums.Status;

import java.util.List;

public class CategoryModel {
    private Long categoryId;
    private String categoryName;
    private Status categoryStatus;

    private List<SubcategoryModel> subcategories;

}
