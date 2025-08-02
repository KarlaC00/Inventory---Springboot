package inventory.domain.model.product;

import inventory.domain.model.enums.Status;
import inventory.domain.model.movements.DetailMovementModel;
import inventory.domain.model.user.InventoryGroupModel;
import inventory.infrastructure.persistence.entity.movemens.DetailMovementEntity;

import java.math.BigDecimal;
import java.util.List;

public class ProductModel {
    private Long productId;
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;
    private int productQuantity;
    private Status productStatus;

    private SubcategoryModel subcategory;
    private InventoryGroupModel inventoryGroup;
    private List<DetailMovementModel> detailMovements;
}