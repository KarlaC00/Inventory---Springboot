package inventory.domain.model.movements;

import inventory.domain.model.product.ProductModel;

import java.math.BigDecimal;

public class DetailMovementModel {
    private Long detailId;
    private int quantity;
    private BigDecimal  unitPrice;

    private MovementModel movement;
    private ProductModel product;
}
