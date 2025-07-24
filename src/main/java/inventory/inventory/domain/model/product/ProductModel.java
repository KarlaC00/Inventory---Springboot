package inventory.inventory.domain.model.product;

import inventory.inventory.domain.model.enums.Status;
import java.math.BigDecimal;

public class ProductModel {
    private Long productId;
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;
    private Status productStatus;
}